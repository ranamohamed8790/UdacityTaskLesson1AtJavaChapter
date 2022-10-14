package OOP;

public class RunEncap {
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        Encapsulation e2 = new Encapsulation(5);
        System.out.println("The Value of Default constructor " + e1.getRadius());
        e1.setRadius(15);
        System.out.println("The valid Value of Radius is "
                + e1.getRadius());
        e1.setRadius(-4);
        System.out.println("Prevent to print The invalid Value "
                + e1.getRadius());
    }
}
