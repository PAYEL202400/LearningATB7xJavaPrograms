package ex_14072024;

public class lab074 {
    public static void main(String[] args) {
        String name = "The testing Academy";//SCP
        String name1 = "The testing Academy";//SCP

        //How many strings are created?--1 as both are identical

        String name2 = new String("The testing Academy");//heap area
        //String name3 = new String("The testing Academy");//heap arwa

        // now how many strings created in total?--3

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name1 == name2);// checks location both are different
        System.out.println(name.equals(name2));//checks for content and both are same


    }
}
