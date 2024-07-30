package ex_20072024;

import java.util.Scanner;

public class lab087 {
    public static void main(String[] args) {
        //take user input and check if a number is even and odd
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
