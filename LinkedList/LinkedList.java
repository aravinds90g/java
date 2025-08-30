package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data, Node next1) {
        this.data = data;
        this.next = next1;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
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
        if(head == null) return null;


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

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 , 8 };
        // Node y = new Node(3);
        // System.out.println(y.next);
        Node head = convertArraytoLinkedList(arr);

        // System.out.println(lengthOfLinkedList(head));
        
        // head = removeHead(head);
        // head = removetail(head);
        
        // head = removePositionNode(head, 2);
        
        head = deleteValue(head, 6);
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
