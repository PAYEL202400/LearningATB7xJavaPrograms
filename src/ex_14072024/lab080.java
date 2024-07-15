package ex_14072024;

public class lab080 {
    public static void main(String[] args) {
        //max of 2 nums with ternary operator
        int a= 10;
        int b= 20;
        int max = a>b ? a : b;
        int min = a<b ? b : a;
        System.out.println(max);
        System.out.println(min);
    }
}
