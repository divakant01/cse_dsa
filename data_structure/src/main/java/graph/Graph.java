package graph;

import java.util.LinkedList;

/**
 * @author Divakant Pandey
 */
public class Graph {

    protected final int vertices;
    protected LinkedList<Integer> adjacencyList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList=new LinkedList[this.vertices];
        for (int i = 0; i < this.vertices; i++) {
            adjacencyList[i]=new LinkedList<>();
        }

    }

    protected void addEdge(int v,int w){
        adjacencyList[v].add(w);
    }
}
