package DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern;

import DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern.models.DefenderEngine;
import DesignPatterns.CreationalDesignPattern.AbstractFactoryPattern.models.IEngine;

public class DefenderFactory implements IVehicleFactory {

    @Override
    public void makeCar() {
        IEngine eng = new DefenderEngine();
    }

    @Override
    public void driveCar() {
        makeCar();
        System.out.println("defender in making");
    }
    
}
