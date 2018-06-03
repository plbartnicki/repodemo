import org.junit.Test;
import zaj1.BinarySearch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by klb on 03.06.18.
 */
public class BinarySearchTest {

    @Test
    public void test() {
        int t[] = {100, 100, 95, 78, 78, 78, 69, 50, 50, 25, 20, 10, 9, 9, 3};

        boolean q = BinarySearch.search(t, 9);

        assertTrue(q);

        int t2[] = {100, 100, 95, 78, 78, 78, 69, 50, 50, 25, 20, 10, 9, 9, 3};

        boolean q2 = BinarySearch.search(t, 105);

        assertFalse(q2);
    }
}
