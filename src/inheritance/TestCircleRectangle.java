package inheritance;

public class TestCircleRectangle {
    public static void main(String[] args) {
        CircleFromSimpleGeoObjects circle = new CircleFromSimpleGeoObjects(1);
        System.out.println("A circle: " +  circle.toString());
        System.out.println("A circle Color: " +  circle.getColor());
        System.out.println("A circle Radius: " +  circle.getRadius());
        System.out.println("A circle Area: " +  circle.getArea());
        System.out.println("A circle Perimeter: " +  circle.getPerimeter());
        System.out.println("A circle Diameter: " +  circle.getDiameter());

        System.out.println("\n" + "  ----------------------------Separator line--------------------------------------" + "\n");

        RectangleFromSimpleGeoObjects  rectangle = new RectangleFromSimpleGeoObjects(2, 6);
        System.out.println("A Rectangle: " +  rectangle.toString());
        System.out.println("A Rectangle Color: " +  rectangle.getColor());
        System.out.println("A Rectangle Height: " +  rectangle.getHeight());
        System.out.println("A Rectangle Width: " +  rectangle.getWidth());
    }

    }
