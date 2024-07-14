package ex_14072024;

public class lab058 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total_price = course + GST; // IMPLICIT NARROWING
        int total_price = course + (int)GST; // EMPLICIT NARROWING
        System.out.println(total_price);
    }
}
