package graph;

import java.util.LinkedList;

public class Graph {
    private int v; // no. of vertices in graph
    private LinkedList<Integer> adj[]; // array of linked list foor adjacent node

    public void addEdge(int v , int w)
    {
        adj[v].add(w);
    }

    Graph(int v)
    {
        adj = new LinkedList[v];
        for(int i=0; i<v ; i++)
        {
            adj[i] = new LinkedList<>();
        }
    }

    public int getV() {
        return v;
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }
}
