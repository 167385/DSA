package InJava.technical.sheet1;

import java.util.ArrayList;

public class EvenNumber {
    static void main(String[] args){
        ArrayList<Byte> list = new ArrayList<>();
        byte i = 2;
        while(i <= 50){
           list.add(i);
           i+= 2;
        }
        System.out.println(list);
    }

}
