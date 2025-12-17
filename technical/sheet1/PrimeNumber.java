package InJava.technical.sheet1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    static void main(String[] args) {
System.out.println(primeNumber());
byte num = 45;
        boolean isPrime = num > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .noneMatch(i -> num % i == 0);

        System.out.println(num + (isPrime ? " is prime" : " is not prime"));
        //for (int i = 5; i * i <= num; i += 6) {
        //if (num % i == 0 || num % (i + 2) == 0) return false;
        //}
    }

   static boolean primeNumber() {
        System.out.print("Enter a number to find prime number:");
        Scanner scans = new Scanner(System.in);
        short num = scans.nextShort();
        if (num == 2 || num == 3 )
           return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
       //int sqrt = (int) Math.sqrt(num);
       for (int i = 5; i * i <= num; i += 6) {
           if (num % i == 0 || num % (i + 2) == 0) return false;
           }
       return true;
   }
}
