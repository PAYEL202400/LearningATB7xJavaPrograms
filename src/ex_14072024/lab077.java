package ex_14072024;

public class lab077 {
    public static void main(String[] args) {
        String password = "Pramod@123";
        String pass_u = password.toLowerCase();
        //pass_u == password ->no
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));



    }
}
