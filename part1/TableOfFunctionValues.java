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

|x|-5|-4.5|-4|-3.5|-3|-2.5|-2|-1.5|-1|-0.5| 0 |0.5|1|1.5|2|2.5|3|3.5|4|4.5|5|
|y|-5|-4.5|-4|-3.5|-3|-2.5|-2|-1.5|-1|-0.5| 0 |0.5|1|1.5|2|2.5|3|3.5|4|4.5|5|

 */

public class TableOfFunctionValues {
    public static void main(String[] args) {
        double step = 0.5;
        double x = 5; //максимальный Х
        double minX = -5;//минимальный Х
        int i = 0;
        while (x >= minX) { //подсчитываем сколько у нас всего значений
          //  System.out.println(i + "     " + x);
            x = x - step;
            i++;
        }
        double[] arraX = new double[i];
        double[] arraY = new double[i];
       for (int z =0; z <= arraX.length-1; z++){//заполняем массив и выводим
           arraX[z] = minX;
           arraY[z] = 5 - (arraX[z] * 2 / 2);
           minX = minX + step;
           System.out.println("значение X: " + arraX[z] + " Значение Y: " + arraY[z]);
       }

    }
}
