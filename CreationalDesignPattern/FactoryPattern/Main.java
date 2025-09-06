package DesignPatterns.CreationalDesignPattern.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ScorpioFactory f1 = new Scorpio();
        f1.driveCar();
        ScorpioFactory f2 = new ScorpioN();
        f2.driveCar();
    }
}
