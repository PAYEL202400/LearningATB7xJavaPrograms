package ex_04082024.HasA.EX;

public class Car {
    // Aggregation - hasA
    protected void StartTheCar(){
        new Engine().start();
        new Tyers().rolling();
    }
}
