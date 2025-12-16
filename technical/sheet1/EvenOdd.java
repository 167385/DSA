package InJava.technical.sheet1;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args){
        System.out.println("please Enter an number:");
        Scanner scans = new Scanner(System.in);
        int num = scans.nextInt();
        if(num == 0)
            return;
        if(num % 2 == 0)
            System.out.println("it is even number");
        else
            System.out.println("it is odd number");
        scans.close();
    }
}
