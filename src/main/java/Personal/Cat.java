package Personal;

public class Cat implements Animal{
    private String name;
    private String race;


    public Cat(){}

    public void setName(String name )
    {
        this.name= name;
    }
    @Override
    public String getName() {
        return name;
    }


    @Override
    public String getAnimalGroup() {
        return "mamifero";
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }

    public void setRace(String race)
    {
        this.race = race;
    }

    @Override
    public String getRace()
    {
        return race;
    }

    @Override
    public void displayInfo()
    {
        System.out.println(getName());
        System.out.println(getRace());
        System.out.println(getAnimalName());
        System.out.println(getAnimalGroup());
    }
}
