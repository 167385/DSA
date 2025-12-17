package InJava.technical.sheet1;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args){
     System.out.print("Enter to reverse :");
        Scanner scans = new Scanner(System.in);
        int num = scans.nextInt();
        System.out.println(reverseNumber(num));
    }
    static int reverseNumber(int num){
        int mul = 0;
        while(num!=0){
          byte temp = (byte)(num % 10);
         mul= mul * 10 + temp;
          num/=10;
        }
        return mul;
    }
}
