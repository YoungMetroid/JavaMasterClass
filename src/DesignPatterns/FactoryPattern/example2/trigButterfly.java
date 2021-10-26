package DesignPatterns.FactoryPattern.example2;

import DesignPatterns.FactoryPattern.example2.Butterfly;
import DesignPatterns.FactoryPattern.example2.Complex;

public class trigButterfly extends Butterfly
{
    float y;
    float oldr1,oldi1;
    float cosy,siny;
    float r2cosy,r2siny,i2cosy,i2siny;

    public trigButterfly(float angle)
    {
        y = angle;
        cosy = (float)Math.cos(y);
        siny = (float)Math.sin(y);
    }
    public void Execute(Complex xi, Complex xj)
    {
        oldr1 = xi.getReal();
        oldi1 = xi.getImag();
        r2cosy = xj.getReal() * cosy;
        r2siny = xj.getReal() * siny;
        i2cosy = xj.getImag() * cosy;

        i2siny = xj.getImag()*siny;
        xi.setReal(oldi1 + r2cosy +i2siny);
        xi.setImag(oldi1 - r2siny + i2cosy);
        xj.setReal(oldr1 - r2cosy - i2siny);
        xj.setImag(oldi1 + r2siny - i2cosy);
    }


}
