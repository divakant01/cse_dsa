package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Divakant Pandey
 */
public class DFSTest {

    private Graph g;
    private DFS d;

    @Before
    public void setUp() throws Exception {
        d=new DFS();
        g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
    }

    @Test
    public void testDFS() {
        d.DFS(g,2);
    }
}