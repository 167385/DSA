package InJava.technical.sheet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        System.out.println("Enter a number for n: ");
        Scanner scans = new Scanner(System.in);
        long num = scans.nextLong();
        if (num != 0) {
            fibonacci(num);
        }
        scans.close();
    }
    static void fibonacci(Long num){
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + (i < num ? " " : ""));
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
