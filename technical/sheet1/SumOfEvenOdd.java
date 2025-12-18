package InJava.technical.sheet1;

public class SumOfEvenOdd {
    static void main(String[] args) {
        byte i = 2;
        short even = 0, odd = 0;
        while (i <= 100){
            even = (short) (even + i);
            odd = (short) (odd + (i - 1));
            i+=2;
    }
        System.out.println("sum of even : " + even + ", sum of odd " + odd);
    }
}
