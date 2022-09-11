package tree;

/*
Level order traversal
        1
      /  \
     2   3
    /\
   4  5
 */

public class Problem3 {

    static void printCurrentLevel(Node node, int level)
    {
        if( node == null) return;

        if(level == 0)
        {
            System.out.print(node.key + " ");
            return;
        }

        if(level > 0)
        {
            printCurrentLevel(node.left, level -1);
            printCurrentLevel(node.right, level -1);
        }
    }

    static void printbyLevel(Node node)
    {
        int height = Problem2.height(node);
        System.out.println("Height = "+height);
         for(int i=0; i<height; i++)
         {
             System.out.println("Printing level-"+i);
             printCurrentLevel(node, i);
             System.out.println("\n***********");
         }

    }

    public static void main(String args[])
    {
        Node root;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        printbyLevel(root);
    }


}
