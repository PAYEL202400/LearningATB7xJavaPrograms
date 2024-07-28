package homework_27072024;

import java.util.Arrays;

public class secondhighestsalary {
    public static void main(String[] args) {
        int [] salary = {10,15,9,8,14,20};//salary in lakhs

        //by using functions
        Arrays.sort(salary);
        System.out.println("Second Highest Salary is ->"+ salary[salary.length-2]);
    }
}
