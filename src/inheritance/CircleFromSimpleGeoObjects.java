package inheritance;

import java.lang.invoke.StringConcatFactory;

public class CircleFromSimpleGeoObjects extends SimpleGeoObjects{
    private double radius;
    CircleFromSimpleGeoObjects (){
    }
    CircleFromSimpleGeoObjects (double radius){
        this.radius = radius;
    }
    CircleFromSimpleGeoObjects (double radius, boolean filled, String color){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getDiameter(){
        return Math.pow(radius,2);
    }
    public double getPerimeter(){
        return getDiameter() * Math.PI;
    }
    public String toString() {
        return "Variable of CircleFromSimpleGeoObjects" + "Color =" + getColor()
                + "is Filled" + isFilled() + "Radius= " + getRadius() + "Created on " + getDateCreated();
    }
}
