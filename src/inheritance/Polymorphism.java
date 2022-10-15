package inheritance;

public class Polymorphism {

    public static void main(String[] args) {
        RectangleFromSimpleGeoObjects rect = new RectangleFromSimpleGeoObjects(5, 6, true, "Red");
        CircleFromSimpleGeoObjects cir = new CircleFromSimpleGeoObjects(5, true, "Green");
        displayObject(rect);
        displayObject(cir);

    }

    public static void displayObject(SimpleGeoObjects obj) {
        System.out.println(obj);

    }
}
