package InJava.technical.sheet2;

import java.util.Scanner;

public class RemoveDuplicateWithoutExtraSpace {
    static void main(String[] args){
        System.out.println("Enter a string");
        Scanner scans = new Scanner(System.in);
        String string = scans.nextLine();
        String res = removeDuplicates(string);
        System.out.println("String without duplicates: " + res);
    }
    static String removeDuplicates(String string){
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length(); i++) {
            char current = sb.charAt(i);
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(j) == current) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        return sb.toString();
    }
}
