package array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by rock on 10/6/19.
 */
public class SuffixArraYTest extends SuffixArraY {
    @Test
    public void build() throws Exception {

        int[] i={5, 3, 1, 0, 4, 2};
        SA[] sa=build("banana");
        System.out.println(Arrays.toString(sa));
        assertEquals(Arrays.binarySearch(sa,new SA("ana")),1);
        assertEquals(Arrays.binarySearch(sa,new SA("a")),0);
        assertEquals(Arrays.binarySearch(sa,new SA("anana")),2);
        assertEquals(Arrays.binarySearch(sa,new SA("banana")),3);
        assertEquals(Arrays.binarySearch(sa,new SA("na")),4);
        assertEquals(Arrays.binarySearch(sa,new SA("nana")),5);
    }

}