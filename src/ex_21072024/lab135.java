package ex_21072024;

public class lab135 {
    public static void main(String[] args) {
        //two components of function
        //1. define
        //2. call the function
        for(int i=1;i<5;i++) {
            greet();
        }
        greet2();
    }
       static void greet(){
            System.out.println("Hi, How are you?");
        }

    static void greet2(){
        System.out.println("I am fine. Thank you!!");
    }
}
