package tree;
/*
Check if given tree  is BST or not
        4
       / \
      2   5
     / \
    1   3

 */
public class Problem9 {

    //Note in below solution that l and r  are not left and right child, otherwise if you just compare that below would also return true
    /*
         4
       / \
      2   5
     / \
    1   33

     */
    static boolean isBST(Node root, Node l, Node r)
    {
        // Base condition
        if (root == null)
            return true;

        // if left node exist then check it has
        // correct data or not i.e. left node's data
        // should be less than root's data
        if (l != null && root.key <= l.key)
            return false;

        // if right node exist then check it has
        // correct data or not i.e. right node's data
        // should be greater than root's data
        if (r != null && root.key >= r.key)
            return false;

        // check recursively for every node.
        return isBST(root.left, l, root) // this recursive call will have l as null. It will make sure value of root.left is < root
                && isBST(root.right, root, r); // this recursive call will have r as null. It will make sure value of root.right is > root
    }

    public static void main(String args[])
    {
        Node root;
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println(isBST(root, null, null)); // note  here the l and r are passed as null  and nnot root.left && root.right

    }
}
