package linkedlist;

/*
Add two numbers represented by linked list
Input:
List1: 5->6->3 // represents number 563
List2: 8->4->2 // represents number 842
Output:
Resultant list: 1->4->0->5 // represents number 1405
Explanation: 563 + 842 = 1405
 */
public class Problem2 {
    public static void main(String[] args) {
//        Node head1 = new Node(5);
//        head1.next = new Node(6);
//        head1.next.next = new Node(3);
//
//        Node head2 = new Node(8);
//        head2.next = new Node(4);
//        head2.next.next = new Node(2);


        Node head1 = new Node(7);
        head1.next = new Node(5);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);



        Node head2 = new Node(8);
        head2.next = new Node(4);

        Node result = addNumbers(head1, head2);

        Problem1.printList(Problem1.reverse(result));

    }

    public static Node addNumbers(Node head1, Node head2 )
    {
        Node rev1 = Problem1.reverse(head1);
        Node rev2 = Problem1.reverse(head2);

        Node head = null;
        Node result = null;
        int quotient=0;
        int remainder=0;
        while(rev1 != null && rev2 !=null)
        {
            int sum = rev1.data + rev2.data + quotient;
            remainder = sum % 10;
            quotient = sum /10;
            if(head == null)
            {
                result = new Node(remainder);
                head = result;
            }
            else
            {
                result.next = new Node(remainder);
                result = result.next;
            }
            rev1 = rev1.next;
            rev2 = rev2.next;
        }

        if (quotient != 0 && rev1 ==null && rev2 == null)
        {
            result.next = new Node(quotient);
        }

        if(rev1 !=null && rev2 == null)
        {
            while(rev1 != null)
            {
                int sum = rev1.data + quotient;
                quotient = sum /10;
                remainder = sum % 10;
                result.next = new Node(remainder);
                result=result.next;
                rev1 = rev1.next;
            }
        }
        else  if(rev2 !=null && rev1 == null)
            {
                while(rev2 != null)
                {
                    int sum = rev2.data + quotient;
                    quotient = sum /10;
                    remainder = sum % 10;
                    result.next = new Node(remainder);
                    result=result.next;
                    rev2 = rev2.next;
                }
            }

        return head;
    }
}
