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

        if(arr.length <1){
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
   

    public static Node removeHead(Node head){
        if(head == null){
            return null;
        }

        if(head.next == null){
           return head = null;
        }

        Node temp = head;

        head = temp.next;
        head.back = null;

        return head;
    }

    public static Node removeTail(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node temp =  head;

        while (temp.next != null) {
            

            temp = temp.next;
        }
        // temp.next.back = null;
        Node pre = temp.back ;
        pre.next= null;
        temp.back = null;

        return head;

    }

    public static void main(String[] args) {
        int[] arr = { 1 ,2,3,4,56,7,78 };
        Node head = convertToDLL(arr);

        // head = removeHead(head);
        head = removeTail(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }



}
