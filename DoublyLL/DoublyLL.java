package DoublyLL;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DoublyLL {

    public static Node convertToDLL(int arr[]) {

        if (arr.length < 1) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i], null, temp);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    public static Node removeHead(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head = null;
        }

        Node temp = head;

        head = temp.next;
        head.back = null;

        return head;
    }

    public static Node removeTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }
        // temp.next.back = null;
        Node pre = temp.back;
        pre.next = null;
        temp.back = null;

        return head;

    }

    public static void removeNode(Node node) {
        // Node temp = node;
        if (node.next == null) {
            Node pre = node.back;
            node.back = null;
            pre.next = null;
            return;
        }

        Node pre = node.back;
        Node after = node.next;
        pre.next = after;
        node.back = null;

    }

    public static Node insertHead(Node head, int data) {
        Node temp = head;

        Node newNode = new Node(data);

        temp.back = newNode;
        newNode.next = temp;

        newNode.back = null;

        return newNode;
    }

    public static void insertTail(Node head, int data) {
        Node temp = head;   

        while (temp.next != null) {
            temp = temp.next;
        }

        Node newNode = new Node(data);

        temp.next = newNode;
        newNode.next = null;
        newNode.back = temp;

    }

    public static Node insertNode(Node head, int data, int k) {
        if (k == 1) {
            return insertHead(head, data);
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // If k is greater than length + 1 → insert at tail
        if (temp == null) {
            insertTail(head, data);
            return head;
        }

        Node newNode = new Node(data);
        Node pre = temp.back;

        // Fix connections
        pre.next = newNode;
        newNode.back = pre;
        newNode.next = temp;
        temp.back = newNode;

        return head;

    }



   

    public static Node reverseDLL(Node head){
        Node temp = head;

        Node pre = null;

        while (temp != null) {
             pre = temp.back;
            temp.back = temp.next;
            temp.next = pre;
            temp = temp.back;
        }

        return pre.back;

    }

    public static void main(String[] args) {
        int[] arr = { 78, 1, 3, 4, 5, 6, 8, 9 };
        Node head = convertToDLL(arr);

        // head = removeHead(head);
        // head = removeTail(head); 

        // removeNode(head.next.next.next);

        // head = insertHead(head, 999);

       head = insertNode(head, 888, 44);

       head = reverseDLL(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

}
