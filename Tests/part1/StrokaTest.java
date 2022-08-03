package part1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrokaTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
    }

    @Test
    public void checkStringOnRepeats() {
       boolean actual = Stroka.checkStringOnRepeats("asdilhgbhogertyhjzxvnkalr");
       boolean expected = true;
        assertEquals(expected, actual);
    }
}