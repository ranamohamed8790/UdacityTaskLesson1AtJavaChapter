package inheritance;

public class DynamicBinding {
    public static void main(String[] args) {
       /** Here we can create the object by adding in the Stack the Parent class name */
       // also we can do that
       // Object rect1 = new CircleFromSimpleGeoObjects();

        SimpleGeoObjects rect = new RectangleFromSimpleGeoObjects(5, 6, true, "Red");
        SimpleGeoObjects cir = new CircleFromSimpleGeoObjects(5, true, "Green");
        displayObject(rect);
        displayObject(cir);

        CircleFromSimpleGeoObjects c1 = new CircleFromSimpleGeoObjects();
        SimpleGeoObjects s1 = c1;   /**up Casting >>> implicit */
        CircleFromSimpleGeoObjects  c2 = (CircleFromSimpleGeoObjects) s1;  /**up Casting >>> explicit  */
    }
    public static void displayObject(SimpleGeoObjects obj) {
        /** here the implemented Method of toString  Code for child class not parent one */
        System.out.println(obj.toString());

    }
}
