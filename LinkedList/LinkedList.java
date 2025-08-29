package LinkedList;
class Node {
    int data ;
    Node next;
    Node(int data, Node next1){
        this.data = data;
        this.next = next1;
    }

    Node(int data){
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


    public static int lengthOfLinkedList(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static int findValue (Node head, int target){
            Node temp = head;
            while (temp != null) {
                if(temp.data == target) return 1;
                temp = temp.next;
            }

            return 0;
    }
  
     public static int deleteValue(Node head, int target){
           Node temp = head;
           int value = 0;
           while (temp != null) {
               if(temp.data == target){
                value = target;
                 Node dataNode = temp.next;
                 temp.data = dataNode.data;
                 temp.next = dataNode.next;
               }

               temp = temp.next;

           }

           return value;
     }


    public static void main(String[] args) {



        
        int[] arr = {1,2,3,4,5};
        // Node y = new Node(3);
        // System.out.println(y.next);
         Node head = convertArraytoLinkedList(arr);
         
         Node temp = head;  

        //  while (temp != null) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        //  }

        System.out.println(deleteValue(head, 4));
        System.out.println(lengthOfLinkedList(head));

    }
}


