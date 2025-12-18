package InJava.technical.sheet2;

import java.util.Scanner;

public class CheckNumber {
    static void main(String[] args){
        System.out.println("enter a number: ");
        Scanner scans = new Scanner(System.in);
        int nums = scans.nextInt();
        if(nums == 0){
            System.out.println("number is zero");
        } else if (nums > 0 ) {
            System.out.println("number is positive");
        } else{
            System.out.println("number is negative");
        }

    }
}
