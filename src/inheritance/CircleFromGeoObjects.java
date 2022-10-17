package inheritance;

public class CircleFromGeoObjects extends GeoObjects {
    private double radius;

    CircleFromGeoObjects() {
    }

    CircleFromGeoObjects(double radius) {
        this.radius = radius;
    }

    CircleFromGeoObjects(double radius, boolean filled, String color) {
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

    public double getPerimeter() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {

//      return "Variable of CircleFromSimpleGeoObjects " + " Rectangle Color = " + getColor()
//                + " is Filled " + isFilled() + " Radius= " + getRadius();
        return "Abstract Child Circle Class is: { Radius=  " + getRadius() + ", "
                + super.toString() + "}" + "\n";
    }
}
