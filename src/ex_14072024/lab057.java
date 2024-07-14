package ex_14072024;

public class lab057 {
    public static void main(String[] args) {
        long phone_no = 987564230l;
        //short s = phone_no; // implicit narrowing
        short s = (short) phone_no;
        System.out.println(s);
    }
}
