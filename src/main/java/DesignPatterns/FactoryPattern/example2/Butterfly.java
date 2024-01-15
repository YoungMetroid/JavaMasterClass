package DesignPatterns.FactoryPattern.example2;

abstract public class Butterfly
{
    float y;

    public Butterfly()
    {

    }
    public Butterfly(float angle)
    {

    }
    abstract public void Execute(Complex x, Complex y);
}
