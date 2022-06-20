package part1;
/*
Реализуйте алгоритм, определяющий, все ли символы в строке встречаются только один раз.
 */

import java.util.Scanner;

public class Stroka {
    public static void main(String[] args) {
        Scanner myScannerIn = new Scanner(System.in);
        System.out.println("Введите строку которую надо проверить: ");
        String str = myScannerIn.nextLine();
        int i = 0;
        int count = 0;
        while ( i < str.length()-1) {
        int len = str.length()-1;
            while (len > i) {
                if (str.charAt(i) == str.charAt(len)){
                    count++;
                }
                    len--;
            }
           i++;
        }
        if (count > 0) System.out.println("В строке ЕСТЬ повторяющиеся символы");
        else System.out.println("В строке НЕТ повторяющихся символов");




    } //main
}//class
