package DesignPatterns.CreationalDesignPattern.FactoryPattern;

import DesignPatterns.CreationalDesignPattern.FactoryPattern.models.IEngine;
import DesignPatterns.CreationalDesignPattern.FactoryPattern.models.ScorpioEngine;

public class Scorpio implements ScorpioFactory {
    public void makeScorpio(){
        IEngine eng = new ScorpioEngine();
    }
    public void driveCar(){
        makeScorpio();
        System.out.println("scorpio in making");
    }
}
