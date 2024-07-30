package ex_20072024;

import java.util.Scanner;

public class lab093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser");
        String browsername = sc.next();

        switch(browsername){
            case "chrome":
                System.out.println("Starting Chrome");
                break;
            case "firefox":
                System.out.println("Starting firefox");
                break;
            case "edge":
                System.out.println("Starting edge");
                break;
            default:
                System.out.println("no idea which browser to start");
        }
    }
}
