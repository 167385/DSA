package InJava.technical.sheet3;

public class PascalTriangle {
    static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            // Print spaces for alignment
            for (int space = 0; space < 5 - i; space++) {
                System.out.print(" ");
            }

            int num = 1; // First number in each row is 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                // Compute next number in row using formula
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
