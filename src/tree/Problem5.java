package tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* Vertical order traversal
           1
        /    \
       2      3
      / \   /   \
     4   5  6   7
               /  \
              8   9
 */
public class Problem5 {

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
        printVerticalOrder(root);
    }

    private static void printVerticalOrder(Node root) {
        Map<Integer, ArrayList<Node>> map = new TreeMap<>();
        populateVerticalOrderMap(map, 0, root);
        for(Integer key: map.keySet())
        {
            System.out.println("For level - "+key + " :  elements "+ map.get(key).toString() );
        }
    }

    static void populateVerticalOrderMap(Map<Integer, ArrayList<Node>> map, Integer hD, Node node)
    {
        if(node == null) return;
        if(map.get(hD) == null)
        {
            ArrayList<Node> list = new ArrayList<>();
            list.add(node);
            map.put(hD, list);
        }
        else {
            map.get(hD).add(node);
        }
        populateVerticalOrderMap(map, hD-1, node.left);
        populateVerticalOrderMap(map, hD+1, node.right);
    }
}
