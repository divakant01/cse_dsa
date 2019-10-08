package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Divakant Pandey
 */
public class KahnAlgoTopoSortingTest {

    private KahnAlgoTopoSorting g;

    @Before
    public void setUp() throws Exception {
        g=new KahnAlgoTopoSorting(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
    }

    @Test
    public void topologicalSorting() {
        g.topologicalSorting();
    }
}