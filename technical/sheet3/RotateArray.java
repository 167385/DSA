package InJava.technical.sheet3;

/// Array reversal algo
public class RotateArray {
static void main(String[] args){
    int[] arr = {56, 35, 89, 40, 1, 100};
    byte pos = 4;
}
static void rotate(int[] arr, int pos){
    byte len =(byte) arr.length;
    if(len == 0){
        return;
    }
    pos = pos%2;
    if(pos < 0) pos+=len;
    reverse(arr,0, arr.length-1);
    reverse(arr, 0, pos-1);
    reverse(arr, pos, arr.length-1);
}
static void reverse(int[] arr, int left, int right){
    while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
}
