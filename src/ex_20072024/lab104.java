package ex_20072024;

import java.util.Scanner;

public class lab104 {
    public static void main(String[] args) {
        //program to find largest among 3 numbers


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1 = sc.nextInt();
        System.out.println("Enter a num2");
        int num2 = sc.nextInt();
        System.out.println("Enter a num3");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("num1 is largest->"+ num1);

        }else if(num2>num1 && num2>num3){
            System.out.println("num2 is largest->"+ num2);
        }else{
            System.out.println("num3 is largest->"+ num3);
        }
    }
}
