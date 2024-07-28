package homework_27072024;

import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int row=sc.nextInt();
        for(int i=0; i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
