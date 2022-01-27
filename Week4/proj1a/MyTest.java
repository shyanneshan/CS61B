import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Shyanne Shan
 * @created 1/27/22/2022 - 4:18 PM
 */
public class MyTest {

    @Test
    public void testAddFirst(){
        LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();
        lld1.addFirst(1);
        lld1.addFirst(2);
        lld1.addFirst(3);
        int expected = 1;
        int actual = lld1.size();
        assertEquals(expected, actual);

    }

    @Test
    public void testAddLast(){
        LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();
        lld1.addFirst(1);
        lld1.addLast(2);
        lld1.addLast(3);
        lld1.addLast(4);

        int expected = 4;
        int actual = lld1.size();
        assertEquals(expected, actual);

    }

    @Test
    public void testPrint(){
        LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();

        lld1.addFirst(1);
        lld1.addLast(2);
        lld1.addLast(3);
        lld1.addLast(4);
        lld1.printDeque();
    }


}
