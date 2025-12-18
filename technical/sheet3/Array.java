package InJava.technical.sheet3;

import java.util.Scanner;

public class Array {
    static void main(String[] args){
        Scanner scans = new Scanner(System.in);
        System.out.print("Enter size row: ");
        short a = scans.nextShort();
        System.out.print("Enter size col: ");
        short b = scans.nextShort();
        int[][] arr= new int[a][b];
        System.out.println("Enter an element of 2d array: ");
        int i = 0;
        while (i< arr.length){
            int j =0;
            while (j < arr[i].length){
                arr[i][j] = scans.nextInt();
                j++;
            }
            i++;
        }
        for(int[] r : arr){
            for (int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
