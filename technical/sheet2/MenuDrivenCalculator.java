package InJava.technical.sheet2;

import java.util.Scanner;

public class MenuDrivenCalculator {
    static double add(double a, double b){
        return a+b;
    }
    static double sub(double a, double b){
        return a-b;
    }
    static double mul(double a, double b){
        return a*b;
    }
    static double div(double a, double b){
        if(b==0){
            System.out.println("divide by zero ");
           return Double.NaN;
        }
        return a/b;
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            // Menu
            System.out.println("Simple Calculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + sub(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + mul(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + div(num1, num2));
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

    }
}
