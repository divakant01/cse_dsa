package graph;

import java.util.Iterator;

/**
 * @author Divakant Pandey
 */
public class DFS {


    public void DFS(Graph g,int vertex){

        boolean[] visited=new boolean[g.vertices];
        DFSRecursive(g,vertex,visited);
    }

    private void DFSRecursive(Graph g, int vertex, boolean[] visited) {

        visited[vertex]=true;
        System.out.print(vertex+" ");

        Iterator<Integer> iterator=g.adjacencyList[vertex].listIterator();

        while (iterator.hasNext()){
            int nextVertex=iterator.next();

            if(!visited[nextVertex]){
                DFSRecursive(g,nextVertex,visited);
            }
        }
    }
}
