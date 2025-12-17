package InJava.technical.sheet1;

import java.util.Scanner;

public class SumOfSeries {
    static void main(String[] args){
        System.out.println("Enter a number for sum of series:");
        Scanner scans = new Scanner(System.in);
        short num = scans.nextShort();
        num = (short) (num*(num + 1) / 2);
        System.out.println(num);
    }
}
