package part1;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrokaTest {

    @Ignore
    @Before
    public void setUp() throws Exception {

    }

    @Ignore
    @After
    public void tearDown() throws Exception {
    }

   @Ignore
    @Test
    public void main() {
    }

    @Test
    public void tryToFound() {
       boolean actual = part1.Stroka.tryToFound("asdilhgbhogertyhjzxvnkalr");
       boolean expected = true;
        assertEquals(expected, actual);
    }
}