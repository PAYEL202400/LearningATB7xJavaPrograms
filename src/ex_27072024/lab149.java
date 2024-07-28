package ex_27072024;

public class lab149 {
    public static void main(String[] args) {
        //create a 2D array
        int array[][]={
                {34,12,45},
                {34,12,11},
                {11,23,98}
        };

        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
