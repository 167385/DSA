package InJava.technical.sheet1;

import java.io.IOException;
import java.util.Scanner;

public class VowelOrConstant {
    static void main(String[] args) throws IOException {
        System.out.print("Enter a character to check vowel or constant: ");
        Scanner scans = new Scanner(System.in);
        char character =  scans.next().toLowerCase().charAt(0);
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is a constant");
        }
    }
}
