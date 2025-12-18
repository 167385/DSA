package InJava.technical.sheet2;

import java.util.Scanner;

public class SwapNumber {
    static void main(String[] args){
        System.out.println("Enter numbers for swap: ");
        Scanner scans = new Scanner(System.in);
        long a = scans.nextLong();
        long b = scans.nextLong();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " " + b);
    }
}
