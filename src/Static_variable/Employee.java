package Static_variable;

public class Employee {
    int empid;
    String name;
    static String company= "LTIMindtree";

    Employee(int empid, String name)
    {
        this.empid=empid;
        this.name=name;
        //this.company=company;
    }

    void display()
    {
        System.out.println(empid + " "+ name+ " "+ company);
    }
}
