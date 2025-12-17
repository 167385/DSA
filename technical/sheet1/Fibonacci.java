package InJava.technical.sheet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        System.out.println("Enter a number for n: ");
        Scanner scans = new Scanner(System.in);
        short num = scans.nextShort();
        if (num != 0) {
            System.out.println(fibonacci(num));
        }
        scans.close();
    }
    static ArrayList<Short> fibonacci(short num){
        ArrayList<Short> list = new ArrayList<>();
       list.add((short) 0);
       list.add((short) 1);
       byte nums = 0;
       while (nums <= num - 3){
         short fibbo = (short) (nums + (nums + 1));
         list.add(fibbo);
           nums++;
       }
        return list;
    }
}
