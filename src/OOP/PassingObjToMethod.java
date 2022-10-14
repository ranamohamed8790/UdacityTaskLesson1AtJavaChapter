package OOP;

public class PassingObjToMethod {
    public static void main(String[] args) {
        Encapsulation e2 = new Encapsulation(5);
        print(e2);
        print(createCircle(10));
    }

    public static void print(Encapsulation e2) {
        System.out.println("Radius " + e2.getRadius() +  "The area of circle is " + e2.getArea());

    }

    public static Encapsulation createCircle(double r) {
        Encapsulation c = new Encapsulation();
        return c;
    }
}
