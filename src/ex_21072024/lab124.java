package ex_21072024;

public class lab124 {
    public static void main(String[] args) {
        //printing even and odd number by using loop with condition
        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even number->"+ i);
                break;
            }
            System.out.println("Odd number->"+ i);
        }
    }
}
