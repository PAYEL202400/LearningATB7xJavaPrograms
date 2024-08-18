package ex_11082024.Excar;

abstract class Testla extends Engine {
    void drive() {
        openCar();
        start();
        partGearBox();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stopping Tesla");

    }

    @Override
    void speed() {
        System.out.println("300km.hr");

    }
}
