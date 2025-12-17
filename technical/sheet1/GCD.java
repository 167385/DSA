package InJava.technical.sheet1;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String inputA = sc.next();
            System.out.print("Enter second number: ");
            String inputB = sc.next();

            if (range(inputA) && range(inputB)) {
                int a = Integer.parseInt(inputA);
                int b = Integer.parseInt(inputB);
                System.out.println("GCD is: " + gcdInt(a, b));
            } else {
                BigInteger a = new BigInteger(inputA);
                BigInteger b = new BigInteger(inputB);
                System.out.println("GCD is: " + a.gcd(b));
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers");
        } finally {
            sc.close();
        }
    }

    // Check if a string fits in int range
    private static boolean range(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Euclidean algorithm for int
    private static int gcdInt(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
