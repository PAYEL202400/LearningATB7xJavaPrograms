package ex_14072024;

public class lab067 {
    public static void main(String[] args) {
        //strings -> collection od characters or sequence of characters
        String name = "Pramod";
        String name2 = new String ("Pramod");
        //How many ways we can store a string
        // 2 ways
        // = , new operator
        // 'SCP' -> String constarint pool
        //new - objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));

    }
}
