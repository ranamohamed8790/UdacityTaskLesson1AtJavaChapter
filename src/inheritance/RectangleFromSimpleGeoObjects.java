package inheritance;

public class RectangleFromSimpleGeoObjects extends SimpleGeoObjects {
    private double width;
    private double height;

    RectangleFromSimpleGeoObjects() {
    }

    RectangleFromSimpleGeoObjects(double height, double width) {
        this.height = height;
        this.width = width;
    }

    RectangleFromSimpleGeoObjects(double height, double width, boolean filled, String color) {
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

    @Override
    public String toString() {
//        return "Child Rectangle Class is: " + " Rectangle Color = " + getColor()
//                + " is Filled " + isFilled() + " Rectangle width= " + (getWidth()) + " Rectangle Height= " + (getHeight())
//                + " Created on " + getDateCreated();
        return "Child Rectangle Class is:  {Rectangle Width = " + getWidth()
                + ", Rectangle Height = " + getHeight() + " " + super.toString() + "}" + "\n";
    }
}
