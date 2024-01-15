package DesignPatterns.FactoryPattern.example2;

public class addButterfly extends Butterfly
{
    float oldr1, oldi1;

    public addButterfly(float angle)
    {

    }
    public void Execute(Complex xi, Complex xj)
    {
        oldr1 = xi.getReal();
        oldi1 = xi.getImag();
        xi.setReal(oldr1 + xj.getReal());
        xj.setReal(oldr1 - xj.getReal());
        xi.setImag(oldi1 + xj.getImag());
        xj.setImag(oldi1 - xj.getImag());
    }
    public void Print()
    {

    }
}
