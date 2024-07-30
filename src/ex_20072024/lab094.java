package ex_20072024;

import java.util.Scanner;

public class lab094 {
    public static void main(String[] args) {
        //take user input and check if it is a vowel or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char alphabet = sc.next().charAt(0);
        System.out.println(alphabet);

        switch(alphabet){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, it is a consonent");
        }
    }
}
