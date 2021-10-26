package DesignPatterns.FactoryPattern.example2;

public class Complex
{
    float real;
    float imag;

    float getReal()
    {
        return real;
    }
    float getImag()
    {
        return imag;
    }
    void setReal(float real)
    {
        this.real = real;
    }
    void setImag(float imag)
    {
        this.imag = imag;
    }

    @Override
    public String toString()
    {
        return "Real: " + getReal() + "    Image " + getImag();
    }
}
