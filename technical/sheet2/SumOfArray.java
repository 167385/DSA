package InJava.technical.sheet2;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArray {
    static void main(String[] args){
        Scanner scans = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        char con = 'y';
        int sum = 0;
        short i = 0;
        while(con == 'y'){
            System.out.println("Enter an number in array");
            arr.add(scans.nextInt());
            sum = sum + arr.get(i) ;
            System.out.print("to more add enter 'y' :");
            con = scans.next().toLowerCase().charAt(0);
            i++;
        }
        System.out.println(arr);
        System.out.println("sum of array: " + sum);
    }
}
