package InJava.technical.sheet2;

import java.util.Scanner;

public class CheckPalindromeString {
    static void main(String[] args){
        System.out.println("enter a string");
        Scanner scans = new Scanner(System.in);
        String str = scans.nextLine();
                int left = 0;
                int right = str.length() - 1;
                while (left < right) {
                    char c1 = str.charAt(left);
                    char c2 = str.charAt(right);
                    if (isAlph(c1)) {
                        left++;
                        continue;
                    }
                    if (isAlph(c2)) {
                        right--;
                        continue;
                    }
                    c1 = lower(c1);
                    c2 = lower(c2);
                    if (c1 != c2) {
                        System.out.println("Not a Palindrome");
                        break;}
                    left++;
                    right--;

                    if(left>=right)
                        System.out.println("palindrome");
                }
            }
            static boolean isAlph(char c) {
                if (c >= '0' && c <= '9') return false;
                if (c >= 'A' && c <= 'Z') return false;
                if (c >= 'a' && c <= 'z') return false;
                return true;
            }
            static char lower(char c) {
                if (c >= 'A' && c <= 'Z') {
                    return (char)(c + 32);
                }
                return c;
            }
        }



