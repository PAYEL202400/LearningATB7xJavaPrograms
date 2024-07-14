package ex_14072024;

public class lab056 {
    public static void main(String[] args) {
        //TYPE CASTING= Source and destination conversion
        //WIDENING - implicit, explicit - lossless
        //NARROWING - implicit, explicit(with data type), loss

        //WIDENING
        byte b =10;
        int a=b; //VALID implicit casting
        int a1 = (int)b; //VALID EXPLICIT CASTING
        System.out.println(a1);

        //NARROWING
        int val = 300;
        //byte b1 = val; //INVALID IMPLICIT CASTING
        byte b1 = (byte)val; //INVALID EXPLICIT CASTING
        System.out.println(b1);
    }
}
