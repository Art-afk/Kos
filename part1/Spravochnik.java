package part1;
import java.util.*;
import java.util.Collections;

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
        Map<String,Integer> peopleSalary = createPeopleBase();
        ArrayList minimumSalary = getMinSalary(peopleSalary);
       // int maximumISalary = getMaxSalary(values);


        if (debug) System.out.println("minimumsAlary " + minimumSalary); //debug
    //    if (debug) System.out.println("maximumAlary " + maximumISalary); //debug
        //System.out.println("Minimum salary: " + getKeyFromMapValue(peopleSalary, minimumSalary) + " " + minimumSalary);
        //System.out.println("Maximum salary: " + getKeyFromMapValue(peopleSalary, maximumISalary) + " " + maximumISalary);
       // checkAverageMediumSalary(peopleSalary, values);
        if (debug) System.out.println("debug" + peopleSalary);
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
        if (debug) System.out.println("All people and salary " + peopleSalary); //debug
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

    public static ArrayList getMinSalary(Map<String,Integer> peopleSalary) {
        ArrayList<String> list = new ArrayList();
        int value = Integer.MAX_VALUE;
        String fio = "";
        for (String key : peopleSalary.keySet()
        ) {
            int salary = peopleSalary.get(key);
            if (value > salary) {
                value = salary;
                fio = key;

            }
        }
        list.add(fio);
        for (String key : peopleSalary.keySet()
        ) {
            if (value == peopleSalary.get(key) && !fio.equals(key)) {
                list.add(key);

            }
        }
        System.out.println(value);

    return list;
    }

    public static int getMaxSalary(ArrayList list) {
        //if(debug)  System.out.println("all salary " + list); //debug
        int i = 0;
        int maximum = (int) Collections.max(list);
            return maximum;

    } //checkMaxSalary


    public static void checkAverageMediumSalary(Map peopleMap) {
        int summ = 0;
        for (Object c : peopleMap.keySet()
        ) {
            if (debug) System.out.println("salary " + c); //debug
            summ = (int) c + summ;
        }
        if (debug) System.out.println("Median: " + summ / peopleMap.size()); //debug
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
