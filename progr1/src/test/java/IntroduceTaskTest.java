
import org.junit.Test;
import zaj1.IntroduceTask;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by klb on 27.05.18.
 */
public class IntroduceTaskTest {

    @Test
    public void testIsPath() {
        assertTrue(IntroduceTask.isPath("GDDGLLPP"));
        assertFalse(IntroduceTask.isPath("GDDGLLPPP"));
        assertTrue(IntroduceTask.isPath("PDDGLG"));
        assertFalse(IntroduceTask.isPath("PDDGDDDDDGLG"));
        assertTrue(IntroduceTask.isPath(""));
    }

    @Test
    public void testFib() {
        assertEquals( 1,  IntroduceTask.fib(2));
        assertEquals( 5,  IntroduceTask.fib(5));
    }


}
