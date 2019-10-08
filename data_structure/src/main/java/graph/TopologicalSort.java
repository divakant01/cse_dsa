package graph;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Divakant Pandey
 */
public class TopologicalSort {

    private  Graph g;

    public TopologicalSort(final Graph g) {
        this.g=g;
    }

    public void topologicalSort(){

        boolean[] visited=new boolean[g.vertices];
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < g.vertices; i++) {
            if(!visited[i])
                topologicalSortRec(stack,visited,i);
        }

        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }

    private void topologicalSortRec(Stack<Integer> stack, boolean[] visited, int i) {
        visited[i]=true;

        Iterator<Integer> iterator=g.adjacencyList[i].listIterator();

        while (iterator.hasNext()){

            int vertex=iterator.next();

            if(!visited[vertex])
                topologicalSortRec(stack,visited,vertex);
        }

        stack.push(i);
    }

}
