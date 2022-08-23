package part1;

import java.util.*;
import java.lang.Math.*;

/*
Необходимо создать справочник с типом. <Имя, Зарплата>, добавить туда 10 имён, зарплаты внести
случайным образом от 25 000 до 100 000, зарплата должна быть кратна 1000. Имена задаются разработчиком.
Затем:
1.Вывести имя человека с самой высокой и самой низкой зарплатой
2.Вывести имена  всех, у кого зарплата выше средней
3.Посчитать зарплату после уплаты налогов и вывести в формате <Имя> - <на руки> - <налог>
 */
public class Spravochnik {
    public static boolean debug = false;
    public static int minSalary = 25000;
    public static int maxSalary = 100000;

    public static void main(String[] args) {
        double tax = 0.13;
        // createPeopleBase();
        Map<String, Integer> peopleSalary = createPeopleBase();
        ArrayList minimumSalary = getMinSalary(peopleSalary);
        ArrayList maximumISalary = getMaxSalary(peopleSalary);
        ArrayList mediumSalary = filterAboveAverage(peopleSalary);
        System.out.println("Minimum salary: " + minimumSalary.get(0));
        System.out.println("Maximum salary: " + maximumISalary.get(0));
        System.out.println("People with above average salaries: " + mediumSalary);
        if (debug) System.out.println("*debug* " + peopleSalary);
        Map<String, List<Double>> peopleSalaryAndTax = getSalaryAfterTax(peopleSalary, tax);
        //System.out.println(getSalaryAfterTax(peopleSalary, tax));// print all salary after pay tax
        for (String key : peopleSalaryAndTax.keySet()
        ) { //Вывод зарплаты после уплаты налогов и вывести в формате <Имя> - <на руки> - <налог>
            System.out.println(key + " - " + " Salary after tax: " + peopleSalaryAndTax.get(key).get(0) + " Tax: " + peopleSalaryAndTax.get(key).get(1));
        }

    }

    public static Map<String, Integer> createPeopleBase() {
        Map<String, Integer> peopleSalary = new HashMap<String, Integer>();
        peopleSalary.put("Vasya", randomSalaryGenerate(minSalary, maxSalary));//1
        peopleSalary.put("Petya", randomSalaryGenerate(minSalary, maxSalary));//2
        peopleSalary.put("Olga", randomSalaryGenerate(minSalary, maxSalary));//3
        peopleSalary.put("Anna", randomSalaryGenerate(minSalary, maxSalary));//4
        peopleSalary.put("Kostya", randomSalaryGenerate(minSalary, maxSalary));//5
        peopleSalary.put("Korge", randomSalaryGenerate(minSalary, maxSalary));//6
        peopleSalary.put("Kolya", randomSalaryGenerate(minSalary, maxSalary));//7
        peopleSalary.put("Taniya", randomSalaryGenerate(minSalary, maxSalary));//8
        peopleSalary.put("Vasilisa", randomSalaryGenerate(minSalary, maxSalary));//9
        peopleSalary.put("Marina", randomSalaryGenerate(minSalary, maxSalary));//10
        if (debug) System.out.println("*debug* All people and salary " + peopleSalary); //debug
        return peopleSalary;


    }


    public static int randomSalaryGenerate(int min, int max) {
        Random r = new Random();
        int diff = max - min;
        int i = 0;
        while (i % 1000 == 0) {
            i = r.nextInt(diff + 1);
            i += min;
        }
        return i;
    }//randomSalaryGenerate

    public static ArrayList getMinSalary(Map<String, Integer> peopleSalary) {
        /*
        find minimum salary in map and return key(FIO)
         */
        ArrayList<String> peopleListMinSalary = new ArrayList();
        int minSalary = Integer.MAX_VALUE;
        for (String key : peopleSalary.keySet()
        ) {
            int curentSalary = peopleSalary.get(key);
            if (curentSalary <= minSalary) {
                if (minSalary == curentSalary)
                    peopleListMinSalary.add(key);
                else {
                    peopleListMinSalary.clear();
                    peopleListMinSalary.add(key);
                }
                minSalary = curentSalary;
            }
        }
        if (debug) System.out.println("*Debug* minimum salary: " + minSalary + " " + peopleListMinSalary);

        return peopleListMinSalary;
    }

    public static ArrayList getMaxSalary(Map<String, Integer> peopleSalary) {
          /*
        find maximum salary in map and return key(FIO)
         */
        ArrayList<String> peopleListMaxSalary = new ArrayList();
        int maxSalary = 0;
        for (String key : peopleSalary.keySet()
        ) {
            int curentSalary = peopleSalary.get(key);
            if (curentSalary >= maxSalary) {
                if (maxSalary == curentSalary)
                    peopleListMaxSalary.add(key);
                else {
                    peopleListMaxSalary.clear();
                    peopleListMaxSalary.add(key);
                }
                maxSalary = curentSalary;
            }
        }
        if (debug) System.out.println("*Debug* maximum salary: " + maxSalary + " " + peopleListMaxSalary);
        return peopleListMaxSalary;
    } //checkMaxSalary


    public static ArrayList filterAboveAverage(Map<String, Integer> peopleMap) {
           /*
        find medium salary in map and return key(FIO)
         */
        ArrayList<String> peopleMediumSalaryList = new ArrayList();
        int salarySum = 0;
        for (String key : peopleMap.keySet()
        ) {
            if (debug) System.out.println("*debug* salary " + key); //debug
            salarySum += peopleMap.get(key);
        }
        if (debug) System.out.println("*debug* Medium: " + salarySum / peopleMap.size()); //debug

        int salaryMedium = salarySum / peopleMap.size();
        for (String key : peopleMap.keySet()
        ) {
            if (peopleMap.get(key) > salaryMedium)
                peopleMediumSalaryList.add(key);
        }
        return peopleMediumSalaryList;
    }

    public static Map<String, List<Double>> getSalaryAfterTax(Map<String, Integer> peopleMap, double tax) {
        //3.Посчитать зарплату после уплаты налогов и вывести в формате <Имя> - <на руки> - <налог>
        Map<String, List<Double>> peopleSalaryAndTax = new HashMap<String, List<Double>>();
        for (String key : peopleMap.keySet()
        ) {
            List<Double> listSalaryAndTax = new ArrayList<Double>();
            listSalaryAndTax.add((peopleMap.get(key) - (peopleMap.get(key) * tax))); // salary after tax
            listSalaryAndTax.add(peopleMap.get(key) * tax); // tax
            peopleSalaryAndTax.put(key, listSalaryAndTax);
            if (debug)
                System.out.println("*debug*" + key + " Salary: " + (peopleMap.get(key) - (peopleMap.get(key) * tax)) + " Tax: " + (peopleMap.get(key) * tax));
        }
        return peopleSalaryAndTax;
    }
}
