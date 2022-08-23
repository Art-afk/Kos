package part1;
/*
Написать алгоритм генерации пароля на основании входных данных - длина последовательности, наличие заглавных букв, цифр, спецсимволов.
Для упрощения можно написать метод, который на входе получает необходимые параметры.
 */

import java.util.Scanner;
import java.util.*;


public class PasswordGenerator {
    public static void main(String[] args) {
        boolean upper = false;
        boolean number = false;
        boolean scharacters = false;
        Scanner src = new Scanner(System.in);
        System.out.println("Какой длинны нужен пароль?");
        int longs = Integer.parseInt(src.nextLine());
       // System.out.println("Сколько сгенерировать?");
        // int longsT = Integer.parseInt(src.nextLine());
        System.out.println("Использовать Цифры?(yes/NO");
        if (src.nextLine().equalsIgnoreCase("yes"))
            number = true;
        System.out.println("Использовать Заглавные буквы?(yes/NO");
        if (src.nextLine().equalsIgnoreCase("yes"))
            upper = true;
        System.out.println("Использовать спецсимволы?(yes/NO");
        if (src.nextLine().equalsIgnoreCase("yes"))
            scharacters = true;

        System.out.println(generate(longs,number, upper, scharacters));
    }

    public static String generate(int longs, boolean number, boolean upper, boolean scharacters){
      //  for (int i = 0; i <= longsT -1; i++) {
            String password = "";
            for (int ac = 0; ac <= longs - 1; ac++) {
                password = password + (char) swap(number, upper, scharacters);
            }
            return password;
       // }
    }
    public static int randomAlphaBig() {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'A'); //all BIG alphabet
        return c;
    }

      public static int randomAlphaSmall() {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a'); //all BIG alphabet
        return c;
    }

    public static int randomAllNumber() {
        Random r = new Random();
        char c = (char) (r.nextInt(10) + '0'); //all numbers
        return c;
    }

    public static int randomAllSymbol() {
        Random r = new Random();
        char a = (char) (r.nextInt(16) + ' '); //first scpecsimbol alphabe
        char b = (char) (r.nextInt(7) + ':'); //first scpecsimbol alphabe
        char c = (char) (r.nextInt(6) + '['); //first scpecsimbol alphabe
        char d = (char) (r.nextInt(4) + '{'); //first scpecsimbol alphabe
        int[] arr = {a, b, c, d};
        int i = r.nextInt(4); //смущает такой рендом должна быть цифра 3
        return arr[i];
    }


    public static int swap(boolean number, boolean upper, boolean schar) {
        //собираем всё в кучу и возвращаем рандомный символ в соответствие с выбором пользователя
        int num = -1;
        int up = -1;
        int sch = -1;
        if (number) {
            num = randomAllNumber();

        }
        if (upper) {
            int b = 0;
            int c = 0;
            b = randomAlphaBig();
            c = randomAlphaSmall();
            int[] arr = {b, c};
            Random r1 = new Random();
            int i = r1.nextInt(2);//смущает такой рендом должна быть цифра 1 (с 0 до 1 для генерации 0 1)
            up = arr[i];
        }
        else {
            up = randomAlphaSmall();
        }
        if (schar)
            sch = randomAllSymbol();

        Random r2 = new Random();
        int[] arr = {num, up, sch};
        while (true) {
            int i = r2.nextInt( 3); //смущает такой рендом должна быть цифра 2 (с 0 до 2 для генерации 0 1 2 )
            if (arr[i] >= 0) {
                return arr[i];
            }
        }

    }


}
