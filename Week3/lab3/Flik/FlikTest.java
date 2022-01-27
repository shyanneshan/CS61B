import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
/**
 * @author Shyanne Shan
 * @created 1/27/22/2022 - 1:58 PM
 */

public class FlikTest {

    @Test
    public void testFlikIsSameNumber(){
        Integer a = 128;
        Integer b = 128;
        assertEquals("a and b should be equal",true, Flik.isSameNumber(a,b));
    }
}
