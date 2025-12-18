package InJava.technical.sheet1;

import java.util.Scanner;

public class CountDigits {
    static void main(String[] args){
        System.out.println("Enter a number :");
        Scanner scans = new Scanner(System.in);
        long a = scans.nextLong();
        byte count = 1;
        while( a != 0){
            a/= 10 ;
            if(a != 0){
           count  ++;
            }
        }
        System.out.println(count);
    }
}
