package InJava.technical.sheet2;

import java.util.Scanner;

public class CountInString {
    static  void main(String[] args){
        System.out.println("Enter an string: ");
        Scanner scans = new Scanner(System.in);
        String str = scans.nextLine().toLowerCase();
        short i = 0 , v =0, c = 0, d =0, s=0;
        while(i < str.length()){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            }
            else if (ch >= '0' && ch <= '9') {
                d++;
            }
            else {
                s++;
            }
            i++;
        }
    }
}
