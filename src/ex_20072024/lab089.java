package ex_20072024;

import java.util.Scanner;

public class lab089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();

        if(age>18){
            System.out.println("You can go to Goa");
        }else if (age>30){
            System.out.println("ypu can go to maldives");
        }
    }
}
