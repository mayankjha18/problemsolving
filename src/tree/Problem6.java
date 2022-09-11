package tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* Top View of binary tree
           1
        /    \
       2      3
      / \   /   \
     4   5  6   7
               /  \
              8   9
 */
public class Problem6 {

    public static void main(String[] args) {

        // TO DO Auto-generated method stub
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printTopView(root);
    }

    private static void printTopView(Node root) {
        Map<Integer, ArrayList<Node>> map = new TreeMap<>();
        Problem5.populateVerticalOrderMap(map, 0, root);
        for(Integer hd: map.keySet() )
        {
            //printing the first element of verticalorderMap
            System.out.print(map.get(hd).get(0).toString() + " ");
        }
    }
}


