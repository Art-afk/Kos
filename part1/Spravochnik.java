package part1;

import java.util.*;

/*
Необходимо создать справочник с типом. <Имя, Зарплата>, добавить туда 10 имён, зарплаты внести
случайным образом от 25 000 до 100 000, зарплата должна быть кратна 1000. Имена задаются разработчиком.
Затем:
1.Вывести имя человека с самой высокой и самой низкой зарплатой
2.Вывести имена  всех, у кого зарплата выше средней
3.Посчитать зарплату после уплаты налогов и вывести в формате <Имя> - <на руки> - <налог>
 */
public class Spravochnik {
    public static boolean debug = true;
    public static int minSalary = 25000;
    public static int maxSalary = 100000;

    public static void main(String[] args) {
        int tax = 13;
        // createPeopleBase();
        Map<String, Integer> peopleSalary = createPeopleBase();
        ArrayList minimumSalary = getMinSalary(peopleSalary);
        ArrayList maximumISalary = getMaxSalary(peopleSalary);
        ArrayList mediumSalary =  getAverageMediumSalary(peopleSalary);
        //    if (debug) System.out.println("maximumAlary " + maximumISalary); //debug
        System.out.println("Minimum salary: " + minimumSalary);
        System.out.println("Maximum salary: " + maximumISalary);

        if (debug) System.out.println("*debug* " + peopleSalary);
        // checkSalaryAfterTax(peopleSalary, tax);// print all salary after pay tax
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
        ArrayList<String> list = new ArrayList();
        int value = Integer.MAX_VALUE;
        for (String key : peopleSalary.keySet()
        ) {
            int salary = peopleSalary.get(key);
            if (value >= salary) {
                if (value == salary)
                    list.add(key);
                else {
                    list.clear();
                    list.add(key);
                }
                value = salary;
            }
        }
        if (debug) System.out.println("*Debug* minimum salary: " + value + " " + list);

        return list;
    }

    public static ArrayList getMaxSalary(Map<String, Integer> peopleSalary) {
          /*
        find maximum salary in map and return key(FIO)
         */
        ArrayList<String> list = new ArrayList();
        int value = 0;
        for (String key : peopleSalary.keySet()
        ) {
            int salary = peopleSalary.get(key);
            if (value <= salary) {
                if (value == salary)
                    list.add(key);
                else {
                    list.clear();
                    list.add(key);
                }
                value = salary;
            }
        }
        if (debug) System.out.println("*Debug* maximum salary: " + value + " " + list);
        return list;
    } //checkMaxSalary


    public static ArrayList getAverageMediumSalary(Map peopleMap) {
           /*
        find medium salary in map and return key(FIO)
         */
        int summ = 0;
        for (Object c : peopleMap.keySet()
        ) {
            if (debug) System.out.println("*debug* salary " + c); //debug
            summ = (int) c + summ;
        }
        if (debug) System.out.println("*debug* Median: " + summ / peopleMap.size()); //debug
        System.out.println("-----------------------------------");
        System.out.println("Employee with above average salary: ");
        for (Object salary : peopleMap.keySet()
        ) {
            if ((int) salary > summ / peopleMap.size())
                System.out.println((salary) + " " + salary);
        }
    }

    public static void checkSalaryAfterTax(Map<String, Integer> peopleMap, int tax) {
        //3.Посчитать зарплату после уплаты налогов и вывести в формате <Имя> - <на руки> - <налог>
        System.out.println("-----------------------------------");
        for (String entry : peopleMap.keySet()
        ) {
            System.out.println(entry + " Salary: " + ((int) peopleMap.get(entry) - (int) peopleMap.get(entry) * 0.13) + " Tax: " + ((int) peopleMap.get(entry) * 0.13));
        }

    }
}
