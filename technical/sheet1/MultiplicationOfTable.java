package InJava.technical.sheet1;

import java.util.Scanner;

public class MultiplicationOfTable {
    static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner scans = new Scanner(System.in);
        short num = scans.nextShort();
        short i = 1;
        while (i <= 10){
            short table = (short) (num * i);
            System.out.println(table);
            i++;
        }
    }

}
