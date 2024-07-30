package ex_20072024;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lab092 {
    public static void main(String[] args) {
        //Switch condition
        //write a program to print from which day it is from Sunday to Saturday

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("no idea which day it is");
        }
        System.out.println("outside of switch loop");
    }
}

