package tree;

public class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }

    //just added it to print the value in problem5 , printing value of nodes in array
    @Override
    public String toString() {
        return String.valueOf(key);
    }
}
