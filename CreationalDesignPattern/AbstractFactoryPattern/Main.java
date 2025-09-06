package DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        IVehicleFactory f1 = new ScorpioFactory();
        IVehicleFactory f2 = new DefenderFactory();
        f1.driveCar();
        f2.driveCar();
    }
}
