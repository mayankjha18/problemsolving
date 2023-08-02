package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Problem1 {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
    }

    public static void bFS(Graph g)
    {
    }
}
