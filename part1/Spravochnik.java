import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
Необходимо создать справочник с типом. <Имя, Зарплата>, добавить туда 10 имён, зарплаты внести
случайным образом от 25 000 до 100 000, зарплата должна быть кратна 1000. Имена задаются разработчиком.
Затем:
1.Вывести имя человека с самой высокой и самой низкой зарплатой
2.Вывести имена  всех, у кого зарплата выше средней
3.Посчитать зарплату после уплаты налогов и вывести в формате <Имя> - <на руки> - <налог>
 */
public class Spravochnik {

    public static void main(String[] args) {
        int minSalary = 25000;
        int maxSalary = 100000;
        createPeople(minSalary,maxSalary);




    }
    public static void createPeople(int minSalary,int maxSalary){
        Map<String,Integer> peopleSalary = new HashMap<String,Integer>();
        peopleSalary.put("Vasya", randomSalaryGet(minSalary,maxSalary));//1
        peopleSalary.put("Petya", randomSalaryGet(minSalary,maxSalary));//2
        peopleSalary.put("Olga", randomSalaryGet(minSalary,maxSalary));//3
        peopleSalary.put("Anna", randomSalaryGet(minSalary,maxSalary));//4
        peopleSalary.put("Kostya", randomSalaryGet(minSalary,maxSalary));//5
        peopleSalary.put("Korge", randomSalaryGet(minSalary,maxSalary));//6
        peopleSalary.put("Kolya", randomSalaryGet(minSalary,maxSalary));//7
        peopleSalary.put("Taniya", randomSalaryGet(minSalary,maxSalary));//8
        peopleSalary.put("Vasilisa", randomSalaryGet(minSalary,maxSalary));//9
        peopleSalary.put("Marina", randomSalaryGet(minSalary,maxSalary));//10
        //{Petya=96000, Kostya=74000, Taniya=50000, Olga=88000, Kolya=92000, Vasilisa=51000, Vasya=31000, Korge=49000, Anna=59000, Marina=61000}


    }

    public static int randomSalaryGet(int min, int max){
        while (true) {
            Random r = new Random();
            int diff = max - min;
            int i = r.nextInt(diff + 1);
            i += min;
            if (i % 1000 == 0) {
                return i;
            }
        }

    }

}
