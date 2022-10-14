package OOP;

public class Circle {
    int radius;
    boolean printed;
    char c;
    String name;
    static int x;

    // Default Constructor
    // not having return type even void and it is public and its name like Class name
    public Circle() {
        x++;
    }

    public Circle(int r) {
        radius = r;
        x++;

    }
}


