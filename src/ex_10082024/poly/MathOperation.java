package ex_10082024.poly;
//Encapsulation
public class MathOperation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int add(int a, int b) {
        return a + b;
    }

    // Method Overloading
    int add(int pramod, int dutta, int amit, int mehga) {
        return pramod + dutta;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }

    String add(String a, String b) {
        return a + b;
    }

    String add(String a, int b) {
        return a + b;
    }

    String add(int b, String a) {
        return a + b;
    }

    MathOperation() {
    }

    MathOperation(int a) {
    }

    MathOperation(int a, int b) {
    }

    MathOperation(int a, int b, int c) {
    }

    MathOperation(int a, int b, int c, String d) {
    }


}

