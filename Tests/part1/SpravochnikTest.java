package part1;

import org.junit.Ignore;
import org.junit.Test;
import part1.Spravochnik;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SpravochnikTest {

    @Ignore
    @Test
    public void main() {
    }

    @Test
    public void createPeopleBase() {
        assertNotNull("Error, Map not generate", Spravochnik.createPeopleBase());
    }

    @Test
    public void randomSalaryGenerate() {
        for (int i =0; i<1000000; i++) {
            int a = 10000;
            int b = 50000;
            int random = Spravochnik.randomSalaryGenerate(a, b);
            assertTrue("Error, not range", (random >= a && random <= b));

        }
    }

    @Test
    public void getMinSalary() {
        Map<String, Integer> peopleSalary = new HashMap<String, Integer>();
        ArrayList<String> myarray = new ArrayList<>();
        peopleSalary.put("Vasya", 45000);//1
        peopleSalary.put("Petya", 77000);//2
        peopleSalary.put("Olga", 78000);//3
        peopleSalary.put("Anna", 35000);//4
        peopleSalary.put("Kostya", 87000);//5
        peopleSalary.put("Korge", 35000);//6
        myarray = Spravochnik.getMinSalary(peopleSalary);
        int i = 0;
        for (String c: myarray
             ) {
           if (c.equals("Anna") || c.equals("Korge")){
               i++;
           }

        }
        assertEquals("Error, function not work",2,i);



    }
    @Test
    public void getMaxSalary() {
        Map<String, Integer> peopleSalary = new HashMap<String, Integer>();
        ArrayList<String> myarray = new ArrayList<>();
        peopleSalary.put("Vasya", 45000);//1
        peopleSalary.put("Petya", 77000);//2
        peopleSalary.put("Olga", 78000);//3
        peopleSalary.put("Anna", 35000);//4
        peopleSalary.put("Kostya", 87000);//5
        peopleSalary.put("Korge", 87000);//6
        myarray = Spravochnik.getMaxSalary(peopleSalary);
        int i = 0;
        for (String c: myarray
        ) {
            if (c.equals("Kostya") || c.equals("Korge")){
                i++;
            }

        }
        assertEquals("Error, function not work",2,i);
    }

    @Test
    public void getAverageMediumSalary() {
        Map<String, Integer> peopleSalary = new HashMap<String, Integer>();
        ArrayList<String> myarray = new ArrayList<>();
        peopleSalary.put("Vasya", 45000);//1
        peopleSalary.put("Petya", 77000);//2
        peopleSalary.put("Olga", 78000);//3
        peopleSalary.put("Anna", 35000);//4
        peopleSalary.put("Kostya", 87000);//5
        peopleSalary.put("Korge", 25000);//6
        //57833 medium
        myarray = Spravochnik.getAverageMediumSalary(peopleSalary);
        int i = 0;
        for (String c: myarray
        ) {
            if (c.equals("Petya") || c.equals("Olga") || c.equals("Kostya")){
                i++;
            }

        }
        assertEquals("Error, function not work" + myarray,3,i);
    }

}