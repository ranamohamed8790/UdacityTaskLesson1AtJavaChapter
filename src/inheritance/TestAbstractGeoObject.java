package inheritance;

public class TestAbstractGeoObject {
    public static void main(String[] args) {
        GeoObjects circle1 = new CircleFromGeoObjects(5);
        GeoObjects rec1 = new RectangleFromGeoObjects(4, 3);
        System.out.println("Do the Area of 2 shape is equal? \n"
                + "The Answer is: "+ equalArea(circle1, rec1));

        displayObject(circle1);
        displayObject(rec1);
    }

    public static void displayObject(GeoObjects obj1) {
        System.out.println();
        System.out.println("The Area= " +
                obj1.getArea());
        System.out.println("The Perimeter= " +
                obj1.getPerimeter());
    }

    public static boolean equalArea(GeoObjects circle2, GeoObjects rec2) {
        return circle2.getArea() == rec2.getArea();
    }
}
