package InJava.technical.sheet3;

public class Search {
    static void main(String[] args){
        int[] arr = {68,78,2,89,23};
        int tar = 89;
        int i =0;
        while ( i < arr.length ){
            if(tar == arr[i]){
                System.out.println("index no :" + i);
                break;
            }
            i++;
        }
    }
}
