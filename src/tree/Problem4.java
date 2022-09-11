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

public class Problem4 {

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

        printRightview(root);
    }

    static boolean isPrinted = false;

    private static void printLeftview(Node node) {
        int height = Problem2.height(node);
        for(int i=0; i<=height; i++)
        {
            isPrinted = false;
            printFirstElementByLevel(node, i);
            System.out.println();
        }
    }

    private static void printFirstElementByLevel(Node node, int level) {
        if(level == 0 || node == null) return;
        if(level == 1 && !isPrinted)
        {
            System.out.print(node.key + " ");
            isPrinted = true;
        }
        if(level > 1)
        {
            printFirstElementByLevel(node.left, level-1);
            printFirstElementByLevel(node.right, level-1);
        }
    }

// This is just same as left view with only recursion reversed with node.right call first
    private static void printRightview(Node node) {
        int height = Problem2.height(node);
        for(int i=0; i<=height; i++)
        {
            isPrinted = false;
            printLastElementByLevel(node, i);
            System.out.println();
        }
    }
    private static void printLastElementByLevel(Node node, int level) {
        if(level == 0 || node == null) return;
        if(level == 1 && !isPrinted)
        {
            System.out.print(node.key + " ");
            isPrinted = true;
        }
        if(level > 1)
        {
            printLastElementByLevel(node.right, level-1);
            printLastElementByLevel(node.left, level-1);

        }
    }


}
