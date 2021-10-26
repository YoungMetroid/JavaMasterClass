package DesignPatterns.AbstractFactoryPattern.GardenTypes;

import DesignPatterns.AbstractFactoryPattern.Garden;
import DesignPatterns.AbstractFactoryPattern.Plant;

public class PerennialGarden extends Garden
{
    public Plant getCenter() {return new Plant("PCenter");}
    public Plant getBorder() {return new Plant("PBorder");}
    public Plant getShade() {return new Plant("PShade");}
}
