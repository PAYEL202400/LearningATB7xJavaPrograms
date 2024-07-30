package ex_20072024;

public class lab098 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode) {
            case 001 -> System.out.println("it is an electronic gadget");
            case 002 -> System.out.println("it is a mechanical gadget");
            case 003 -> System.out.println("it is a robotic gadget");
            default -> System.out.println("no idea");
        }
    }
}
