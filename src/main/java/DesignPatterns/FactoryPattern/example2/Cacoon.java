package DesignPatterns.FactoryPattern.example2;

public class Cacoon {
    public Butterfly getButteryfly(float y)
    {
        if(y!=0)
        {
            return new trigButterfly(y);
        }
        else
        {
            return new addButterfly(y);
        }
    }

    public static void main(String[] args)
    {
        int img = 0;
        int real = 0;

        for(String s:args)
        {

            Butterfly fly = new Cacoon().getButteryfly(Float.parseFloat(s));
            Complex complex = new Complex();
            Complex complex2 = new Complex();
            complex.setImag(img);
            complex.setReal(real);

            complex2.setImag(img+1);
            complex2.setReal(real+2);

            System.out.println("Before: " + complex.toString());
            System.out.println("Before: " + complex2.toString());
            fly.Execute(complex,complex2);
            System.out.println("After: " + complex);
            System.out.println("After: " + complex2);
            img++;
            real=+2;
        }
    }
}
