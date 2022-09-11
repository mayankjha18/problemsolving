package tree;
/*
check for symmetric tree (Mirror Image)
ex -1 TRUE
         5
       /   \
      1     1
     /       \
    2         2

ex-2  FALSE
          5
       /   \
      10     10
     /  \     \
    20  20     30

 */
public class Problem7 {


    public static void main(String args[])
    {
        Node root;
        root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(2);
        root.right.right = new Node(2);

        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(Node root)
    {
        return isSymmetric(root,root);
    }

    private static boolean isSymmetric(Node node1, Node node2)
    {
        if(node1 == null && node2 == null)
        {
            return true;
        }

        if(node1!=null && node2!=null && node1.key ==node2.key)
        {
            return isSymmetric(node1.left,node2.right) && isSymmetric(node1.right, node2.left);
        }

        // if the code is able to reach here that means symmetricity is broken
        return false;
    }

}
