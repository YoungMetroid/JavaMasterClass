package section6;

import javax.swing.plaf.IconUIResource;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public Car(){
        doors = 0;
        wheels = 0;
    }
    public void SetModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }
        else this.model = "Unknown";
    }
    public void SetEngine(String engine){
        this.engine = engine;
    }
    public void SetColour(String colour){
        this.colour = colour;
    }
    public void ViewSpecs(){
        System.out.println("Model: " + model);
        System.out.println("There are " + doors + " doors in the car");
        System.out.println("Engine: " + engine);
        System.out.println("Colour: " + colour);
    }
    public String GetModel(){
        return this.model;
    }
    public String GetEngine(){
        return this.engine;
    }
    public String GetColour(){
        return this.colour;
    }

}
