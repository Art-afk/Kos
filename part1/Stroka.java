package part1;
/*
Реализуйте алгоритм, определяющий, все ли символы в строке встречаются только один раз.


уменьшить в половину длинну поиска
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Stroka {
    public static void main(String[] args) {
        Scanner myScannerIn = new Scanner(System.in);
        System.out.println("Введите строку которую надо проверить: ");
        long m = System.currentTimeMillis();
      //  String str = myScannerIn.nextLine();
        String str = "asdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadho";

        int i = 0;
        int low =0;
        int hight = str.length()-1;
        int medi = (low + hight) / 6;
        System.out.println("Средне число " + medi);
        int count = 0;
        byte[] stoka = str.getBytes(StandardCharsets.UTF_8);
        /*
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




      //  for ()

        //   if (count > 0) System.out.println("В строке ЕСТЬ повторяющиеся символы");
        //else System.out.println("В строке НЕТ повторяющихся символов");


         */
        for (byte c: stoka
             ) {
            System.out.println("byte: " + c + " Char to: " + (char) c);
        }

        System.out.println((double) (System.currentTimeMillis() - m));


    } //main
}//class
