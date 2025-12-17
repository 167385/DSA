package InJava.technical.sheet1;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args){
        System.out.println("Enter a number :");
        Scanner scans = new Scanner(System.in);
        short num = scans.nextShort();
        short nums = num;
        short store = 0;
        while(num != 0){
            byte a = (byte) (num%10);
            store = (short) (store * 10 + a);
            num = (byte) (num/10);
        }
        if(nums == store)
            System.out.println("Palindrome number " + store);
        else
            System.out.println("Not palindrome number " + store);
    }
}
