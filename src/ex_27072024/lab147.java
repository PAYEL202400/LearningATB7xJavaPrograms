package ex_27072024;
import java.util.Arrays;
public class lab147 {
    public static void main(String[] args) {
        //find the max in a array
        //find max and min salary in array
        int [] salaries = {7,10,4,25,18,9,8,17};
        int max=salaries[0];
        int min= salaries[0];
        for(int i=0; i<salaries.length;i++){
            if (salaries[i]> max) {
                max = salaries[i];
            }
            if(min > salaries[i]){
                min= salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        Arrays.sort(salaries);//by using functions
        System.out.println(salaries[salaries.length-2]);
    }
}
