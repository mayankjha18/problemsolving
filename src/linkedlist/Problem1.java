package linkedlist;
/*
Reverse a linked list
 */
public class Problem1 {
    public static void main(String[] args)
    {

        Node head = new Node(85);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        printList(head);
        head = reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        printList(head);
    }


    public static Node reverse(Node node) {
        if(node==null || node.next==null) return node;
        Node prev = node;
        Node current = node.next;
        prev.next = null;
        while(current.next != null)
        {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        current.next = prev;
        return current;
    }

    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

