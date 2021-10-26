package DesignPatterns.AbstractFactoryPattern.GardenTypes;

import DesignPatterns.AbstractFactoryPattern.Garden;
import DesignPatterns.AbstractFactoryPattern.Plant;

public class AnnualGarden extends Garden
{
    public Plant getCenter() {return new Plant("ACenter");}
    public Plant getBorder() {return new Plant("ABorder");}
    public Plant getShade() {return new Plant("AShade");}
}
