package homework_27072024;

import java.util.Scanner;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int row=sc.nextInt();
        for(int i=row; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
