package inheritance;

import java.lang.invoke.StringConcatFactory;
import java.util.Date;

public class CircleFromSimpleGeoObjects extends SimpleGeoObjects {
    private double radius;

    CircleFromSimpleGeoObjects() {
    }

    CircleFromSimpleGeoObjects(double radius) {
        this.radius = radius;
    }

    CircleFromSimpleGeoObjects(double radius, boolean filled, String color) {
        super(color, filled);
        this.radius = radius;
        //setColor(color);
        //setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return getDiameter() * Math.PI;
    }

    @Override
    public String toString() {

//      return "Variable of CircleFromSimpleGeoObjects " + " Rectangle Color = " + getColor()
//                + " is Filled " + isFilled() + " Radius= " + getRadius();
        return "Variable of CircleFromSimpleGeoObjects: { Radius=  " + getRadius() + ", " + super.toString() + "}";
    }
}
