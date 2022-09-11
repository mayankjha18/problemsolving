package tree;

/*
Left view of tree
        1
      /  \
     2   3
    /\
   4  5
      /\
     6  7
 */

public class Test {
    static boolean isPrinted = false;
    public static void main(String args[])
    {
        Node root;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);


        printLeftview(root);

    }

    static void printLeftview(Node  node)
    {
        int height = Problem2.height(node);

       for(int i=0;i<height;i++)
       {
           isPrinted =  false;
           printCurrentLevel(node, i);
       }
    }

    static void printCurrentLevel(Node node, int level)
    {
        if(node==null)
        {
            return;
        }

        if(level == 0 && !isPrinted)
        {
            System.out.print(node.key+"\t");
            isPrinted= true;
        }

        if(level >0)
        {
            printCurrentLevel(node.right, level-1);
            printCurrentLevel(node.left, level-1);

        }
    }


}
