import org.junit.Test;

import static org.junit.Assert.*;

public class moduloTest {

    @Test
    public void watermelon() {
        modulo testclass = new modulo();
        assertEquals("YES", testclass.watermelon(6));
        assertEquals("NO", testclass.watermelon(5));
        assertEquals("YES", testclass.watermelon(100));
        assertEquals("NO", testclass.watermelon(1));
        assertEquals("YES", testclass.watermelon(88));
        assertEquals("NO", testclass.watermelon(33));
    }
}
