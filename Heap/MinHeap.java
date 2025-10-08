package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinHeap {
    ArrayList<Integer> arr;
    int currentSize;
    int size;

    public MinHeap(int currentSize) {
        this.currentSize = currentSize;
        this.size = 0;
        arr = new ArrayList<>();

    }

    public static int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    public static int getLeftIndex(int i) {
        return 2 * i + 1;
    }

    public static int getRightIndex(int i) {
        return 2 * i + 2;
    }

    public void swap(int i, int j) {
        int temp = arr.get(i);
        int temp2 = arr.get(j);
        arr.set(i, temp2);
        arr.set(j, temp);
    }

    public void insertData(int data) {
        arr.add(data); // add the new element at the end

        int currentIndex = arr.size() - 1; // last element index

        while (currentIndex > 0) { // continue until we reach root
            int parentIndex = getParentIndex(currentIndex);

            // if parent is smaller, heap property is correct → stop
            if (arr.get(parentIndex) <= arr.get(currentIndex)) {
                break;
            }

            // otherwise, swap parent and child
            swap(parentIndex, currentIndex);

            // move up to the parent's position
            currentIndex = parentIndex;
        }
    }

    public void deleteMin() {
        if (arr.size() == 0) {
            return; // heap is empty
        }

        int lastIndex = arr.size() - 1;

        // Swap root with last element
        swap(0, lastIndex);

        // Remove the last element (original root)
        arr.remove(lastIndex);

        int currentIndex = 0;

        while (true) {
            int left = 2 * currentIndex + 1;
            int right = 2 * currentIndex + 2;
            int smallest = currentIndex;

            // Check if left child exists and is smaller
            if (left < arr.size() && arr.get(left) < arr.get(smallest)) {
                smallest = left;
            }

            // Check if right child exists and is smaller
            if (right < arr.size() && arr.get(right) < arr.get(smallest)) {
                smallest = right;
            }

            // If parent is already smaller than both children, stop
            if (smallest == currentIndex) {
                break;
            }

            // Otherwise, swap and move down
            swap(currentIndex, smallest);
            currentIndex = smallest;
        }
    }

    public int getSmallest() {
        return arr.get(0);
    }

    public void printEl() {
        System.out.println(arr);
    }

    public static int findKthGreatest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
          for (int num : arr) {
            minHeap.offer(num); // add element to heap
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest element
            }
        }

        return minHeap.peek(); // kth largest element
    }


    public static void main(String[] args) {
        MinHeap heap = new MinHeap(7);

        heap.insertData(2);
        heap.insertData(34);
        heap.insertData(4);
        heap.insertData(6);
        heap.printEl();
        heap.deleteMin();
        heap.printEl();
        System.out.println(heap.getSmallest());

        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthGreatest(arr, k));
    }

}
