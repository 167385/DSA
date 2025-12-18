package InJava.technical.sheet2;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementInArray {
    static void main(String[] args){
        System.out.println("Enter a size of a array: ");
        Scanner scans = new Scanner(System.in);
        int a = scans.nextInt();
        int i = 0;
        int[] arr = new int[a];
        while(i < a){
arr[i] = scans.nextInt();
            i++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
    }
}
