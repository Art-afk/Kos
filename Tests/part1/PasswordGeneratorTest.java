package part1;

import org.junit.*;

import static org.junit.Assert.*;

public class PasswordGeneratorTest {



    @Ignore
    @Before
    public void setUp() throws Exception {
    }

    @Ignore
    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void generate() {
        //собираем пароль
        int length = 11;
        String password = PasswordGenerator.generate(length,true ,false,false); //m53l32t7m8 вывод
        assertTrue(password.length() == length);
        System.out.println(password);
        boolean containDigit = false;
        boolean containUpper = false;
        boolean containScpecSymbol = false;
        for(char c : password.toCharArray()){
            if (Character.isDigit(c))
                containDigit = true;

            if (Character.isUpperCase(c)){
                containUpper = true;
            }
            if ((c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 & c <= 126)){
                containScpecSymbol = true;
            }
        }
        assertTrue("Error, not found symbol",containDigit);
        assertFalse("Error, found UpperCase",containUpper);
        assertFalse("Error, found SpecSymbol",containScpecSymbol);
        //--------------------------------------------------------------------------------------------//
         length = 40;
         password = PasswordGenerator.generate(length,false ,true,true); //m53l32t7m8 вывод
        assertTrue(password.length() == length);
        System.out.println(password);
         containDigit = false;
         containUpper = false;
         containScpecSymbol = false;
        for(char c : password.toCharArray()){
            if (Character.isDigit(c))
                containDigit = true;

            if (Character.isUpperCase(c)){
                containUpper = true;
            }
            if ((c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 & c <= 126)){
                containScpecSymbol = true;
            }
        }
        assertFalse("Error, found Number",containDigit);
        assertTrue("Error, not found UpperCase",containUpper);
        assertTrue("Error, not found SpecSymbol",containScpecSymbol);
        //--------------------------------------------------------------------------------------------//
        length = 20;
        password = PasswordGenerator.generate(length,false ,false,true); //m53l32t7m8 вывод
        assertTrue(password.length() == length);
        System.out.println(password);
        containDigit = false;
        containUpper = false;
        containScpecSymbol = false;
        for(char c : password.toCharArray()){
            if (Character.isDigit(c))
                containDigit = true;

            if (Character.isUpperCase(c)){
                containUpper = true;
            }
            if ((c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 & c <= 126)){
                containScpecSymbol = true;
            }
        }
        assertFalse("Error, found Number",containDigit);
        assertFalse("Error, found UpperCase",containUpper);
        assertTrue("Error, not found SpecSymbol",containScpecSymbol);

    }


    @Test
    public void randomAlphaBig() {
        assertTrue("Error letter is not uppercase", Character.isUpperCase((char) PasswordGenerator.randomAlphaBig()));
    }

    @Test
    public void randomAlphaSmall() {
        assertTrue("Error letter is not lowercase",Character.isLowerCase((char) PasswordGenerator.randomAlphaSmall()));
    }


    @Test
    public void randomAllNumber() {
        assertTrue("Error, number is not integer", (PasswordGenerator.randomAllNumber() % 1) == 0);

    }

    @Test
    public void randomAllSymbol() { //33-47, 58-64, 91-96, 123-124
        for (int i =0; i<100000; i++) {
            int a = PasswordGenerator.randomAllSymbol();

            assertTrue("Error, it's a not a symbol", (a >= 32 && a <= 47) || (a >= 58 && a <= 64) || (a >= 91 && a <= 96) || (a >= 123 & a <= 126));
        }
    }

    @Test
      public void swap() {
       for (int i =0; i<100000; i++) {
            int a = PasswordGenerator.Swap(true,true,true);
            assertTrue( a >= 0 && a <=127);

        }
    }
}