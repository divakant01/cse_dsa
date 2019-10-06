import static org.junit.Assert.*;

/**
 * Created by rock on 10/6/19.
 */
public class LongestChunkedPalindromeDecompositionTest extends LongestChunkedPalindromeDecomposition {

    @org.junit.Test
    public void longestDecomposition() throws Exception {

        assertEquals(longestDecomposition("abc"),1);
        assertEquals(longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"),7);
        assertEquals(longestDecomposition("merchant"),1);
        assertEquals(longestDecomposition("antaprezatepzapreanta"),11);
        assertEquals(longestDecomposition("aaa"),3);
        assertEquals(longestDecomposition(""),0);
        assertEquals(longestDecomposition(null),0);
        assertEquals(longestDecomposition("elvtoelvto"),2);

    }

}