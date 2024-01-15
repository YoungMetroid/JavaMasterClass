package DesignPatterns.AbstractFactoryPattern;

abstract public  class Garden
{
    public abstract Plant getCenter();
    public abstract Plant getBorder();
    public abstract Plant getShade();
}
