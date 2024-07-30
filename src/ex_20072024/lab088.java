package ex_20072024;

import java.util.Scanner;

public class lab088 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1= sc.nextInt();

        System.out.println("Enter number 2");
        int num2= sc.nextInt();

        if(num1>num2){
            System.out.println("number 1 is greater->"+ num1);
        }else if(num2> num1){
            System.out.println("number 2 is greater->"+ num2);
        }else{
            System.out.println("Both the numbers are equal");
        }

    }
}
