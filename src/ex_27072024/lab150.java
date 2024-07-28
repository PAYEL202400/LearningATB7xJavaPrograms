package ex_27072024;

public class lab150 {
    public static void main(String[] args) {
        int array[][]={
                {34,1},
                {34,2},
                {34,3}
        };

        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
