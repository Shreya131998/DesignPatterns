package DesignPatterns.CreationalDesignPattern.FactoryPattern;

import DesignPatterns.CreationalDesignPattern.FactoryPattern.models.IEngine;
import DesignPatterns.CreationalDesignPattern.FactoryPattern.models.ScorpioNEngine;

public class ScorpioN implements ScorpioFactory {
    public void makeScorpio(){
        IEngine eng = new ScorpioNEngine();
    }
    public void driveCar(){
        makeScorpio();
        System.out.println("ScorpioN engine in making");
    }
}
