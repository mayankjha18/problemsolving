package tree;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Determine if a tree is  balanced or not
https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
ex -
         5
       /   \
      1     1
     /       \
    2         2
     \       /
     4      7


 */
public class Problem8 {
    public static void main(String[] args) {
        Node root;
        root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.right.right = new Node(2);
        root.right.right.left = new Node(7);

        System.out.println(isBalanced(root));

    }

    private static boolean isBalanced(Node node)
    {

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        int lheight = Problem2.height(node.left);
        int rheight = Problem2.height(node.right);

        if (Math.abs(lheight - rheight) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }

}
