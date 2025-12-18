package InJava.technical.sheet3;

import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args){
        int[] arr = {67, 89, 1, 3, 100};
        byte left = 0;
        byte right = (byte) (arr.length - 1);
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
