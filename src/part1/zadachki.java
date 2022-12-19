package part1;

import java.io.PrintWriter;
import java.util.Scanner;

public class zadachki {

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);

        int a = sr.nextInt();
       int sum = 0;
       if(a >=0)
       {
           for(int i =0; i <= a; i++)
            sum += i;
        }
       else {
           for(int i =0; i >= a; i--)
               sum -= i;
       }

        System.out.println(sum);

        System.out.println("----");
        sum = (1 + a) *

    }
}
