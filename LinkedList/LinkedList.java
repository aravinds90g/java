package LinkedList;

import java.util.HashMap;

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

    public static Node middleNode(Node head) {
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
           temp =temp.next;
            temp2 = temp2.next;
        }

        return head;
    }


    public static Node reverseList(Node head) {
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

    while(temp.next != null){

      if(map.containsKey(temp)){
        pre.next =  null; 
        break;
      }
      map.put(temp, map.getOrDefault(temp,0)+1);

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

    public static void main(String[] args) {

        int[] arr = { 1, 2,3,5,68,8,899,0 };
        int[] arr2 = {  2 };
        // Node y = new Node(3);
        // System.out.println(y.next);
        Node head1 = convertArraytoLinkedList(arr);
        Node head2 = convertArraytoLinkedList(arr2);

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

        Node temp = mergeSortedNode(head1, head2);
       temp = reverseList(temp);
        

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
