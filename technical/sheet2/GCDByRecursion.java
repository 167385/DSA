package InJava.technical.sheet2;

import java.util.Scanner;

public class GCDByRecursion {
    static void main(String[] args){
        Scanner scans = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long a = scans.nextLong();
        System.out.print("Enter second number: ");
        long b = scans.nextLong();
        System.out.println(gcd(a,b));
    }
    static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);

    }
}
