package tree;
/*
Find lowest common ancestor in a BST
        20
       /  \
      8   22
     / \
    4   12
       / \
      10  14

 */
public class Problem11 {


    private static Node lca(Node node, int n1, int n2)
    {
        if(node == null)
            return null;

        if(node.key > n1 && node.key > n2)
            return lca(node.left, n1 , n2);

        if(node.key < n1 && node.key < n2)
            return lca(node.right, n1 , n2);

        return node;

    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        int n1 = 10, n2 = 14;
        Node t = lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

        n1 = 14;
        n2 = 8;
        t = lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

        n1 = 10;
        n2 = 22;
        t = lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);
    }
}
