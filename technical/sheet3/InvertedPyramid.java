package InJava.technical.sheet3;

public class InvertedPyramid {
    static void main(String[] args){
        for(int i = 5; i >= 1; i--) {
            for(int k = 0; k < 5 - i; k++ ){
                System.out.print(" ");
            } for (int j = 1 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
