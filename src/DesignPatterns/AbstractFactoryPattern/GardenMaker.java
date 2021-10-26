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
        if(gardenType.equals("Perennial"))
        {
            garden = new PerennialGarden();
        }
        if(gardenType.equals("Annual"))
        {
            garden = new AnnualGarden();
        }
        return garden;
    }
}
