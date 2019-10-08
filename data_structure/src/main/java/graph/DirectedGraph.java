package graph;

import java.util.Arrays;

/**
 * @author Divakant Pandey
 */
public class DirectedGraph extends Graph{

    protected int[] indegree;

    public DirectedGraph(int vertices) {
        super(vertices);
        indegree=new int[this.vertices];
    }


    @Override
    protected void addEdge(int v, int w) {
        super.addEdge(v, w);
        indegree[w]++;
    }

    public DirectedGraph reverse(){

        DirectedGraph reverse=new DirectedGraph(vertices);

        for (int i = 0; i < vertices; i++) {

            for (int w : adjacencyList[i]) {

                reverse.addEdge(w,i);
            }
        
    }
        return reverse;

    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(indegree));
        StringBuilder buffer=new StringBuilder();
        final String SEP="-->";
        final String COMMA=",";
        final String NEWLINE=System.lineSeparator();

        for (int i = 0; i < vertices; i++) {

            buffer.append(i).append(SEP);

            for(int j:adjacencyList[i]){
                buffer.append(j).append(COMMA);
            }
            buffer.append(NEWLINE);
        }
        return buffer.toString();
    }
}
