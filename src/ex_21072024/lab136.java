package ex_21072024;

public class lab136 {
    public static void main(String[] args) {
        //function without parameter and without a return type
        ////function without parameter and with a return type
        //function with parameter and without a return type
        //function with parameter and with a return type
        func1();
        System.out.println("------------------");
        String name= func2();
        System.out.println(name);
        System.out.println("-------------------");
        func3("Amit");
        System.out.println("--------------------");
        int sum_result= func4(4,5);
        System.out.println("output is->"+ sum_result);
        System.out.println("------------------------");
    }

    static void func1(){
        System.out.println("function without parameter and without a return type");
    }

    static String func2(){
        System.out.println("function without parameter and with a return type");
        return("promod");
    }

    static void func3(String name){
        System.out.println("function with parameter and without a return type");
        System.out.println("You have shared->" +name);
    }

    static int func4(int a, int b){
        System.out.println("function with parameter and with a return type");
        return(a+b);
    }
}
