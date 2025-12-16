package InJava.technical.sheet1;

import java.util.Scanner;

public class LargestAmongThreeNumber {
    static void main(String[] args){
        System.out.println("Enter the Three Number To Find Largest");
        Scanner scans = new Scanner(System.in);
        short a = scans.nextShort();
        short b = scans.nextShort();
        short c = scans.nextShort();
        if(a == 0 && b == 0 && c == 0)
            return;
        if(a > b && b > c){
           System.out.println(a +" " + "is greatest" );
        } else if (b > a && b > c) {
            System.out.println(b +" " + "is greatest");
        } else{
            System.out.println(c + " " + "is greatest");
        }
        scans.close();
    }
}
