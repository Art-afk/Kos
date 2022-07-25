package part1;
/*
Реализуйте алгоритм, определяющий, все ли символы в строке встречаются только один раз.


уменьшить в половину длинну поиска
//Сделано
 */


import java.util.Scanner;

public class Stroka {
    public static void main(String[] args) {
        Scanner myScannerIn = new Scanner(System.in);
        System.out.println("Введите строку которую надо проверить: ");
        long m = System.currentTimeMillis();
         String str = myScannerIn.nextLine();
        //String str = "asdilhgbhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadhogertyhjzxvnkalrjhytgOGIUUDHFGUAldgh5et3405680hrgkldzfnblN'o;IHRGoiehr4803IOHSGHGhisasdilhgiadho";
        //String str = "asdilhgbhogertyhjzxvnkalr";
    if(foundX(str))
        System.out.println("повтор есть");
        else
        System.out.println("повторов нет");

        System.out.println((double) (System.currentTimeMillis() - m)); //время выполнения
    } //main

    public static boolean foundX(String str) {
        boolean[] arr = new boolean[128];
        for (char c : str.toCharArray()) {
            if (arr[c]){
                //System.out.println("повтор: " + c);
                // System.out.println("повтор есть");
                return true;
            }else{
                arr[c] = true;
            }
        }
        return false;
    }


}//class
