package DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern;

import DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern.models.IEngine;
import DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern.models.ScorpioEngine;

public class ScorpioFactory implements IVehicleFactory {

    @Override
    public void makeCar() {
        IEngine eng = new ScorpioEngine();
    }

    @Override
    public void driveCar() {
        makeCar();
        System.out.println("Scorpio in making");
    }
    
}
