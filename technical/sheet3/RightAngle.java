package InJava.technical.sheet3;

public class RightAngle {
    static void main(String[] args){
        for(int i = 1; i <= 5; i++){
                System.out.print("*");
                if(i == 5){
                    for(int j = 1 ; j <= i - 1; j++){
                        System.out.print(" *");
                    }
                }
                System.out.println();
        }
    }
}
