package ex_28072024;

public class lab155 {
    public static void main(String[] args) {

        //CLASS---A ---DATA TYPES--PRIMITIVE AND NON-PRIMITIVE
        //CLASS---B---THESE ARE FUNCTIONS
        //OBJECT---REAL ENTITY/INSTANCE OF A CLASS
        //ClassName classref= new ClassName();
        //new ClassName();--this is object
        //classref-- class reference
        //ClassName-- class name



        BuildingBP  dlf= new BuildingBP();
        dlf.name="DLF pvt limited";
        dlf.noofrooms=100;

        dlf.lift();

        BuildingBP  pestrige= new BuildingBP();
        pestrige.name="Pestrige pvt limited";
        pestrige.noofrooms=100;

        pestrige.lift();

    }
}
