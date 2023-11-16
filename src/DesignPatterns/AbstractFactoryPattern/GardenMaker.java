package DesignPatterns.AbstractFactoryPattern;

import DesignPatterns.AbstractFactoryPattern.GardenTypes.AnnualGarden;
import DesignPatterns.AbstractFactoryPattern.GardenTypes.PerennialGarden;
import DesignPatterns.AbstractFactoryPattern.GardenTypes.VegieGarden;

public class GardenMaker
{
    private Garden garden;
    public Garden getGarden(String gardenType)
    {
        garden = new VegieGarden();
        if("Perennial".equals(gardenType))
        {
            garden = new PerennialGarden();
        }
        if("Annual".equals(gardenType))
        {
            garden = new AnnualGarden();
        }
        return garden;
    }
}
