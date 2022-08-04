import java.util.*;
import java.util.Collections;

/*
Необходимо создать справочник с типом. <Имя, Зарплата>, добавить туда 10 имён, зарплаты внести
случайным образом от 25 000 до 100 000, зарплата должна быть кратна 1000. Имена задаются разработчиком.
Затем:
Вывести имя человека с самой высокой и самой низкой зарплатой
2.Вывести имена  всех, у кого зарплата выше средней
3.Посчитать зарплату после уплаты налогов и вывести в формате <Имя> - <на руки> - <налог>
 */
public class Spravochnik {

    public static void main(String[] args) {
        int minSalary = 25000;
        int maxSalary = 100000;
        workPeopleBase(minSalary, maxSalary);
    }
    public static void workPeopleBase(int minSalary, int maxSalary) {
        Map<String, Integer> peopleSalary = new HashMap<String, Integer>();
        peopleSalary.put("Vasya", randomSalaryGet(minSalary, maxSalary));//1
        peopleSalary.put("Petya", randomSalaryGet(minSalary, maxSalary));//2
        peopleSalary.put("Olga", randomSalaryGet(minSalary, maxSalary));//3
        peopleSalary.put("Anna", randomSalaryGet(minSalary, maxSalary));//4
        peopleSalary.put("Kostya", randomSalaryGet(minSalary, maxSalary));//5
        peopleSalary.put("Korge", randomSalaryGet(minSalary, maxSalary));//6
        peopleSalary.put("Kolya", randomSalaryGet(minSalary, maxSalary));//7
        peopleSalary.put("Taniya", randomSalaryGet(minSalary, maxSalary));//8
        peopleSalary.put("Vasilisa", randomSalaryGet(minSalary, maxSalary));//9
        peopleSalary.put("Marina", randomSalaryGet(minSalary, maxSalary));//10
        System.out.println(peopleSalary); //debug
        ArrayList<Integer> values = new ArrayList<>(peopleSalary.values());
        int minimumSalary = checkMinMaxSalary(values, "min");
        int maximumISalary = checkMinMaxSalary(values, "max");
        //System.out.println(minimumSalary); //debug
        System.out.println("Minimum salary: " + getKeyFromValue(peopleSalary, minimumSalary) + " "+ minimumSalary);
        System.out.println("Maximum salary: " + getKeyFromValue(peopleSalary, maximumISalary) + " "+ maximumISalary);
       checkAndReturnAboveAverageMediumSalary(peopleSalary,values);

    }
    public static Object getKeyFromValue(Map hm, Object value){
        for (Object o: hm.keySet()
             ) {
            if (hm.get(o).equals(value)){
                return o;
            }
        }
        return null;
    }

    public static int randomSalaryGet(int min, int max) {
        while (true) {
            Random r = new Random();
            int diff = max - min;
            int i = r.nextInt(diff + 1);
            i += min;
            if (i % 1000 == 0) {
                return i;
            }
        }
    }//randomSalaryGet

    public static int checkMinMaxSalary(ArrayList list, String minMax) {
      //  System.out.println(list);
        int i = 0;
        if (minMax == "min" || minMax == "") {
            int minimum = (int) Collections.min(list);
            return minimum;
        }
        else { //minMax = max
            int maximum = (int) Collections.max(list);
            return maximum;
        }
    } //checkMinMaxSalary

    public static void checkAndReturnAboveAverageMediumSalary(Map peopleMap,ArrayList salaryArray){
        int summ = 0;
        for (Object c: salaryArray
             ) {
            System.out.println(c);
           summ = (int) c + summ;
        }
        System.out.println(summ / 2);



    }

}
