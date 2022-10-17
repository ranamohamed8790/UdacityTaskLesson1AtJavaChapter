package inheritance;

public class RectangleFromGeoObjects extends GeoObjects {
    private double width;
    private double height;

    RectangleFromGeoObjects() {
    }

    RectangleFromGeoObjects(double height, double width) {
        this.height = height;
        this.width = width;
    }

    RectangleFromGeoObjects(double height, double width, boolean filled, String color) {
        super(color, filled);
        this.height = height;
        this.width = width;
        // setColor(color);
        //setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // SubClass from abstract parent tell me how to do
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
//        return "Child Rectangle Class is: " + " Rectangle Color = " + getColor()
//                + " is Filled " + isFilled() + " Rectangle width= " + (getWidth()) + " Rectangle Height= " + (getHeight())
//                + " Created on " + getDateCreated();
        return "Abstract Child Rectangle Class is:  {Rectangle Width = " + getWidth()
                + ", Rectangle Height = " + getHeight() + " " + super.toString() + "}" + "\n";
    }
}
