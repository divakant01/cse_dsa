package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Divakant Pandey
 */
public class TopologicalSortTest {

    private Graph g;
    private TopologicalSort tp;

    @Before
    public void setUp() throws Exception {
        g=new Graph(6);
        tp=new TopologicalSort(g);

        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

    }

    @Test
    public void testTopologicalSort() {
        tp.topologicalSort();
    }
}