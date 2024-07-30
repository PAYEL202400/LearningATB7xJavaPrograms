package ex_20072024;

import java.util.Scanner;

public class lab103 {
    public static void main(String[] args) {
        //program to check if num is positive or negetive or zero

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("negetive");
        }else{
            System.out.println("zero");
        }


    }
}
