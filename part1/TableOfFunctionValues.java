package part1;


/*
Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
Решение
Алгоритм решения задачи:
1.Присвоить переменной x значение начала отрезка.
2.Пока x не достигнет конца отрезка
3.вычислять значение y по формуле,
4.вывести на экран значение x и y,
5.увеличить x на заданный шаг.

*/

import java.math.BigDecimal;

public class TableOfFunctionValues {

    public static void reshenie(){
        double x = -5;
        double y =0;

        System.out.println(" x   |  y" );
        while ( x <= 5){
            y = 5 - x * x/2;
            System.out.println(x + " | " + y);
            x = x + 0.5;
        }

    }
    public static void main(String[] args) {
        reshenie();
    }
}
