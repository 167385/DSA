package InJava.technical.sheet3;

import java.util.Arrays;

public class MaxMin {
    static void main(String[] args){
        int[] arr = { 67,34,5,79,1};
        Arrays.sort(arr);
        System.out.println("min : "+ arr[0] + ", max : " + arr[arr.length-1]);
    }
}
