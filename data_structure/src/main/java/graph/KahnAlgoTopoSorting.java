package graph;

import java.util.*;

/**
 * @author Divakant Pandey
 */
public class KahnAlgoTopoSorting extends DirectedGraph{


    public KahnAlgoTopoSorting(int vertices) {
        super(vertices);
    }

    public void topologicalSorting(){

        Queue<Integer> queue=new LinkedList<>();

        for (int i = 0; i < vertices; i++) {

            if(indegree[i]==0)
                queue.add(i);
        }

        int count=0;
        List<Integer> topoLogicalOrder=new LinkedList<>();

        while(!queue.isEmpty()) {

            int n=queue.poll();
            topoLogicalOrder.add(n);

            for (int j:adjacencyList[n]){

                if(--indegree[j]==0)
                    queue.add(j);

            }
            count++;
        }

        if(count!=vertices){
            System.out.println("Graph contains cycle "+count);
            return;
        }

        System.out.println(topoLogicalOrder);
    }

}
