package part1;

import org.junit.Ignore;
import org.junit.Test;
import part1.Spravochnik;
import org.junit.jupiter.Assertions;
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
    public void getKeyFromMapValue() {
        Map<String, Integer> myTestMap = new HashMap<String, Integer>();
        myTestMap.put("Vasya", 10000);//1
        assertEquals("Vasya",Spravochnik.getKeyFromMapValue(myTestMap,10000));
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
        ArrayList<String> Array = new ArrayList<>();
        peopleSalary.put("Vasya", 45000);//1
        peopleSalary.put("Petya", 77000);//2
        peopleSalary.put("Olga", 78000);//3
        peopleSalary.put("Anna", 35000);//4
        peopleSalary.put("Kostya", 89000);//5
        peopleSalary.put("Korge", 35000);//6
        Array = Spravochnik.getMinSalary(peopleSalary);
        for (String key : Array
             ) {

        }
        assertArrayEquals("Error,function didn't work",{"Anna","Korge"},{Spravochnik.getMinSalary(peopleSalary)});


    }
    @Test
    public void getMaxSalary() {
        ArrayList<Integer> Array = new ArrayList<>();
        Array.add(8);
        Array.add(9);
        Array.add(4);
        Array.add(2);
        Array.add(5);
        Array.add(1);
        assertEquals("Error, function didn't work", 9, Spravochnik.getMaxSalary(Array));

    }
    @Ignore
    @Test
    public void checkAverageMediumSalary() {
        Map<String, Integer> myTestMap = new HashMap<String, Integer>();
        ArrayList<Integer> values = new ArrayList<>(myTestMap.values());
        myTestMap.put("Vasya", 10000);//1
        myTestMap.put("T", 22000);//1
        myTestMap.put("A", 50000);//1
        myTestMap.put("B", 70000);//1
        myTestMap.put("U", 67000);//1
        myTestMap.put("V", 35000);//1
      //  System.out.println("a");
      //  assertEquals("asd",Spravochnik.checkAverageMediumSalary(myTestMap,values));
    }
    @Ignore
    @Test
    public void checkSalaryAfterTax() {
    }
}