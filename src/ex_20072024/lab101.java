package ex_20072024;

import java.util.Scanner;

public class lab101 {
    public static void main(String[] args) {
        //write a program to print my name, age and salary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name= sc.next();

        System.out.println("Enter age");
        int age= sc.nextInt();

        System.out.println("Enter salary");
        double salary= sc.nextDouble();

        System.out.println("Your name is->"+ name);
        System.out.println("Your age is->"+ age);
        System.out.println("Your salary is->"+ salary);
    }
}
