package InJava.technical.sheet3;

public class BinarySearch {
    static void main(String[] args){
        int[] arr = {1, 5, 9, 11, 39, 45, 99};
        int tar = 45;
        byte left = 0;
        byte right = (byte) (arr.length - 1);
        while (left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == tar){
                System.out.println("index is : " + mid);
            }
            if(arr[mid] < tar){
                left = (byte) (mid + 1);
            }else{
                right = (byte) (mid - 1);
            }
        }

    }
}
