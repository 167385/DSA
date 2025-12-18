package InJava.technical.sheet2;


import java.util.Scanner;

public class FactorialByRecursion {
   static  void main(String[] args){
       System.out.println("enter a number: ");
       Scanner scans = new Scanner(System.in);
       long num = scans.nextLong();
       System.out.println(factorial(num));
   }
   static long factorial(long num){
       if(num == 1){
           return 1;
       }
      return num * factorial(num -1);

   }
}
