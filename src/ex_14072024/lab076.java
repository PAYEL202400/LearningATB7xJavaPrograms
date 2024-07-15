package ex_14072024;

public class lab076 {
    public static void main(String[] args) {
        String s1 = "Pramod";
                   //012345//index places
        char c = s1.charAt(4);
        System.out.println(c);
        s1.concat("Dutta");
        System.out.println(s1);//pramod as we are not storing the value
        s1 = s1.concat("Dutta");
        System.out.println(s1); // PramodDutta

    }
}
