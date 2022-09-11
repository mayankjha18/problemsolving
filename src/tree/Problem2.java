package tree;
/*
Height of binary tree
        1
      /  \
     2   3
    /\
   4  5
 */
public class Problem2 {

    static int height(Node node)
    {
        if(node == null) return 0;

        int lheight = height(node.left);
        int rheight = height(node.right);

        if(lheight > rheight)
        {
            return  lheight+1;
        }
        else
        {
            return  rheight+1;
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

        System.out.println(height(root));
    }
}
