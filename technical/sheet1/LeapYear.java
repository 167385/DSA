package InJava.technical.sheet1;

import java.util.Scanner;

public class LeapYear {
    static void main(String[] args) {
        char more = 'y';
        while (more == 'y') {
            System.out.println("Enter year to find leap or not:");
            Scanner scans = new Scanner(System.in);
            short a = scans.nextShort();
            if (a % 4 == 0 && a % 100 != 0) {
                System.out.println(a + " " + "a Leap year");
            } else {
                System.out.println(a + " " + "not a Leap year");
            }
            System.out.println("To check more enter 'y' else:");
            more = scans.next().toLowerCase().charAt(0);
            scans.close();
        }
    }
}
