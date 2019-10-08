package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Divakant Pandey
 */
public class BFS {

    public void BFS(Graph g,int vertex){

        Queue<Integer> queue=new LinkedList<>();
        boolean[] visited=new boolean[g.vertices];

        queue.add(vertex);

        while (!queue.isEmpty()){

            int v=queue.poll();
            visited[v]=true;

            System.out.print(v+" ");

            Iterator<Integer> iterator=g.adjacencyList[v].listIterator();

            while (iterator.hasNext()){
                int nextVertex=iterator.next();

                if(!visited[nextVertex])
                    queue.add(nextVertex);
            }
        }
    }

}
