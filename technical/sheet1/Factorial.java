package InJava.technical.sheet1;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args)
    {
        System.out.print("Enter a number to find factorial:");
        Scanner scans = new Scanner(System.in);
        byte num = scans.nextByte();
        System.out.println("factorial is: " + factorial(num));
        scans.close();
    }
    static byte factorial(byte num) {
        byte i = 1;
       while(num != 1){
           i*=num;
           num--;
       }
       return i;
    }
}
