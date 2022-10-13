package OOP;

public class Constructor {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);

        System.out.println(c1.radius);
        System.out.println(c1.c);
        System.out.println(c1.printed);
        System.out.println(c1.name);
        System.out.println(c2.radius);

    }


}
