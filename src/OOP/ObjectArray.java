package OOP;

public class ObjectArray {
    public static void main(String[] args) {
        Encapsulation[] arr = new Encapsulation[10];

        for (int i=1; i < arr.length; i++ ){
            arr [i] = new Encapsulation(i);
        }
        for (int i=1; i < arr.length; i++ ){
            Encapsulation e = new Encapsulation();
            e = arr[i];

         System.out.println("Radius " + e.getRadius() +
                 " ,The area of circle is " + e.getArea());

        }
    }
}
