package ex_27072024;

public class lab139 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        //index- 0,1,2
        //len 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[0]= 91;
        marks[1]= 92;
        marks[2]= 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //System.out.println(marks[10]);//AIOBE

        boolean[] is_married = {true,false,true};
        for (int i=0; i<marks.length; i++) {
            System.out.println(i + "->" + marks[i]);
        }
        String weekDays[]= {"Sunday","Monday","Tuesday"};
        for (int i=0; i <=weekDays.length; i++){
            System.out.println(weekDays[i]);
        }

    }
}
