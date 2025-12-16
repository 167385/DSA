package InJava.technical.sheet1;

public class SumOfNaturalNumbers {
    static void main(String[] args){
        short num = 1;
        short sum = 0;
        while (num <= 100){
            sum+= num;
            num++;
        }
        System.out.println("sum of natural number: " + sum);
    }
}
