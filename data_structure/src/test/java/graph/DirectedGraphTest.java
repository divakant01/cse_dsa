package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Divakant Pandey
 */
public class DirectedGraphTest extends DFS {

    private DirectedGraph g;

    @Before
    public void setUp() throws Exception {
        g = new DirectedGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
    }

    @Test
    public void testReverse() {
        System.out.println(g.reverse());
    }

    @Test
    public void testToString() {
        System.out.println(g);
    }
}