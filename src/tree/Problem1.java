package tree;
/* Tree structure
Inorder, Pre order and post order traversal
        1
      /  \
     2   3
    /\
   4  5
 */
public class Problem1 {

    static void printPostorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    static void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    static void printPreorder(Node node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    public static void main(String[] args)
    {
        Node root;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(
                "Preorder traversal of binary tree is ");
        printPreorder(root);

        System.out.println(
                "\nInorder traversal of binary tree is ");
        printInorder(root);

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        printPostorder(root);
    }
}
