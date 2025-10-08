package list.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

 class Node {
    int data;
    Node next;

    // Node random;
    Node(int data, Node next1) {
        this.data = data;
        this.next = next1;

    }

    Node(int data) {
        this.data = data;
        this.next = null;
        // this.random = null;
    }
}

public class LinkedList {

    public static Node convertArraytoLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return head;
    }

    public static int lengthOfLinkedList(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static int findValue(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target)
                return 1;
            temp = temp.next;
        }

        return 0;
    }

    public static Node deleteValue(Node head, int target) {
        if (head == null)
            return null;

        if (head.data == target) {
            return head.next;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == target) {
                temp.next = temp.next.next; // unlink the node
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public static Node removeHead(Node head) {
        if (head == null)
            return head;
        Node temp = head.next;

        head = temp;

        return head;
    }

    public static Node removetail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head.next;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    public static Node removePositionNode(Node head, int k) {
        if (head == null) {
            return null;
        }

        if (k == 1) {
            return head.next;
        }

        int count = 1;
        Node temp = head;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;

    }

    public static Node insertHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertTail(Node head, int data) {
        if (head == null || head.next == null)
            return null;

        Node temp = head.next;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data);

        temp.next = newNode;
        return head;
    }

    public static Node insertKthNode(Node head, int data, int k) {

        if (k == 1) {
            return insertHead(head, data);
        }
        int count = 1;
        Node temp = head;

        while (temp != null) {

            if (count == k - 1)
                break;
            temp = temp.next;
            count++;
        }

        if (temp != null) {
            Node newNode = new Node(data);
            newNode.next = temp.next; // link newNode to next node
            temp.next = newNode; // link previous node to newNode
        } else {
            System.out.println("Position out of range");
        }

        return head;
    }

    public static void insertNextNode(Node node, int data) {
        Node newNode = new Node(data);

        newNode.next = node.next;
        node.next = newNode;

    }

    public static Node middleNode1(Node head) {
        int count = 0;
        if (head == null) {
            return null;
        }
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;

        System.out.println(mid);
        int i = 0;
        temp = head;
        while (temp != null & i <= mid) {

            if (i == mid) {
                head = temp;
                return head;
            }
            temp = temp.next;
            i++;
        }
        return head;
    }

    public static Node mergeSortedNode(Node head1, Node head2) {

        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node head = null;
        Node temp1 = head1;
        Node temp2 = head2;

        if (head1.data <= head2.data) {
            head = new Node(head1.data);
            temp1 = head1.next;
        } else {
            head = new Node(head2.data);
            temp2 = head2.next;
        }

        Node temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                Node newNode = new Node(temp1.data);
                temp.next = newNode;
                temp1 = temp1.next;
            } else if (temp1.data > temp2.data) {
                Node newNode = new Node(temp2.data);
                temp.next = newNode;

                temp2 = temp2.next;
            } else {
                Node newNode = new Node(temp1.data);
                temp.next = newNode;

                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        while (temp1 != null) {
            Node newNode = new Node(temp1.data);
            temp.next = newNode;

            temp1 = temp1.next;
            temp = temp.next;
        }

        while (temp2 != null) {
            Node newNode = new Node(temp2.data);
            temp.next = newNode;
            temp = temp.next;
            temp2 = temp2.next;
        }

        return head;
    }

    public static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node pre = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = pre;
            pre = temp;
            temp = front;
        }

        return pre;
    }

    public static Node removeLoop(Node head) {

        HashMap<Node, Integer> map = new HashMap<>();

        Node temp = head;
        Node pre = null;

        while (temp.next != null) {

            if (map.containsKey(temp)) {
                pre.next = null;
                break;
            }
            map.put(temp, map.getOrDefault(temp, 0) + 1);

            pre = temp;
            temp = temp.next;
        }

        return head;

    }

    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        // boolean foundPoint = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    public static boolean isPalindrome(Node head) {
        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // System.out.println(stack);
        temp = head;
        while (temp != null) {
            if (temp.data != stack.peek()) {
                return false;
            }
            stack.pop();
            temp = temp.next;
        }
        return true;
    }

    public static Node groupLL(Node head) {

        if (head == null || head.next == null)
            return head;

        Node temp = head;
        List<Integer> list = new ArrayList<>();
        // list.add(temp.data);
        while (temp != null) {
            list.add(temp.data);

            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        temp = head.next;

        while (temp != null) {
            list.add(temp.data);

            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                break;
            }
        }

        temp = head;
        // System.out.println(list);

        int i = 0;
        while (temp != null) {
            temp.data = list.get(i);
            temp = temp.next;
            i++;
        }

        return head;

    }

    public static Node groupLLV2(Node head) {
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;

    }

    public static Node removeNthFromEnd(Node head, int n) {

        if (n == 1 && head.next == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;
        // int count = 0;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;

    }

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static Node mergeTwoLL(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node dummyNode = new Node(-1);

        Node temp = dummyNode;
        Node t1 = head1;
        Node t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                temp.next = t1;
                temp = temp.next;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = temp.next;
                t2 = t2.next;
            }
        }

        if (t1 != null) {
            temp.next = t1;
        }

        if (t2 != null) {
            temp.next = t2;
        }

        return dummyNode.next;

    }

    public static Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node mid = middleNode(head);

        Node leftNode = head;
        Node rightNode = mid.next;
        mid.next = null;

        leftNode = mergeSort(leftNode);
        rightNode = mergeSort(rightNode);

        return mergeTwoLL(leftNode, rightNode);

    }

    public static Node sort012(Node head) {
        Node dummyNode0 = new Node(-1);
        Node dummyNode1 = new Node(-1);
        Node dummyNode2 = new Node(-1);

        Node t0 = dummyNode0;
        Node t1 = dummyNode1;
        Node t2 = dummyNode2;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                t0.next = temp;
                t0 = temp;
            } else if (temp.data == 1) {
                t1.next = temp;
                t1 = temp;
            } else {
                t2.next = temp;
                t2 = temp;
            }
            temp = temp.next;
        }

        t0.next = (dummyNode1.next != null) ? dummyNode1.next : dummyNode2.next;
        t1.next = dummyNode2.next;
        t2.next = null;

        return dummyNode0.next;
    }

    public static Node addOne(Node head) {
        // Write your code here.

        Node temp = head;

        int carry = helperFunction(temp);

        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;

            return newNode;
        }

        return head;

    }

    public static int helperFunction(Node temp) {

        if (temp == null) {
            return 1;
        }

        int carry = helperFunction(temp.next);

        temp.data = temp.data + carry;

        if (temp.data < 10) {
            return 0;
        } else {
            temp.data = 0;
            return 1;
        }

    }

    public static Node findKthNode(Node head, int k) {
        Node temp = head;
        k -= 1;
        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    public static Node reverseKthGroupLL(Node head, int k) {
        Node temp = head;
        Node prevNode = null;
        Node nextNode = null;
        while (temp != null) {
            Node kthNode = findKthNode(temp, k);
            if (kthNode == null) {
                if (prevNode != null)
                    prevNode.next = temp;
                break;
            }

            nextNode = kthNode.next;
            kthNode.next = null;

            // printLL(kthNode);
            reverseList(temp);
            // System.out.println();

            if (temp == head) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;

        }

        return head;

    }

    public static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node rotateLL(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        // calculating length
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            ++length;
            temp = temp.next;
        }
        // link last node to first node
        temp.next = head;
        k = k % length; // when k is more than length of list
        int end = length - k; // to get end of the list
        while (end-- != 0)
            temp = temp.next;
        // breaking last node link and pointing to NULL
        head = temp.next;
        temp.next = null;

        return head;

    }

    public static Node deleteDuplicates(Node head) {
        Node dummyNode = new Node(0);

        dummyNode.next = head;

        Node current = head;
        Node prevNode = dummyNode;

        while (current != null) {

            while (current.next != null && current.data == current.next.data) {
                current = current.next;
            }

            if (prevNode.next == current) {
                prevNode = prevNode.next;
            } else {
                prevNode.next = current.next;
            }

            current = current.next;

        }

        return dummyNode.next;
    }

    public static Node reverseBetween(Node head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        for (int i = 0; i < left; i++) {
            prev = prev.next;
        }
        Node current = prev.next;
        Node next = null;

        for (int i = 0; i < right - left - 1; i++) {
            next = current.next;
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // int[] arr2 = { 2 ,8,9,66 };
        // Node y = new Node(3);
        // System.out.println(y.next);
        Node head = convertArraytoLinkedList(arr);

        // Node head2 = convertArraytoLinkedList(arr2);

        // System.out.println(lengthOfLinkedList(head));

        // head = removeHead(head);
        // head = removetail(head);

        // head = removePositionNode(head, 2);

        // head = deleteValue(head, 8);
        // head = insertTail(head, 9);

        // head = insertKthNode(head, 10, 7);
        // insertNextNode(head.next.next.next ,4);

        // head = middleNode(head);

        // Node temp = head;
        // System.out.println(isPalindrome(head));
        // head = removeNthFromEnd(head, 1);
        // head = rotateLL(head , 2);
        // head = deleteDuplicates(head);

        head = reverseBetween(head, 2, 5);
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
