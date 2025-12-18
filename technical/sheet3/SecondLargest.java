package InJava.technical.sheet3;
import java.util.Arrays;

public class SecondLargest {
    static void main(String[] args) {
        int[] arr = {56, 78, 98, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
