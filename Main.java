/*
Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать.
 После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
  В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
 */



import java.util.Scanner;


public class Main {

    public static void main(String[]args){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Введите максимальное, целое число:");
        int maxNum = Integer.parseInt(myNumber.nextLine());
        int rnd = 0 + (int) (Math.random() * maxNum);
//        System.out.println(rnd); //debug
        System.out.println("Введите максимальное колличество попыток: ");
        int maxCount = Integer.parseInt(myNumber.nextLine());
        int count = 0;
        int userNum = 0 + (int) (Math.random() * (maxNum + 100));
        while (userNum != rnd){
            if (count >= maxCount) {
                System.out.println("Колличество попыток вышло!");
                break;
            }
            System.out.println("Угадайте число от 0 до " + maxNum + " :");
            userNum = Integer.parseInt(myNumber.nextLine());
            if (userNum == rnd ){
                System.out.println("Поздравляю! правильный ответ: " + rnd);
                break;
            }
            if (userNum > rnd) System.out.println("Загаданное число меньше");
            else System.out.println("Загаданное число больше");
            count++;
        }


        } //main

}// Main class