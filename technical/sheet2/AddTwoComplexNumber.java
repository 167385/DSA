package InJava.technical.sheet2;

import java.util.Scanner;
class Com{
    double real;
    double imag;
    Com(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    Com add(Com other) {
        return new Com(this.real + other.real, this.imag + other.imag);
    }
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}
public class AddTwoComplexNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("real first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("first complex number: ");
        double i1 = sc.nextDouble();
        System.out.print("real second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("second complex number: ");
        double i2 = sc.nextDouble();
        Com c1 = new Com(r1, i1);
        Com c2 = new Com(r2, i2);

        Com sum = c1.add(c2);

        System.out.print("Sum two complex numbers: ");
        sum.display();

        sc.close();
    }
}
