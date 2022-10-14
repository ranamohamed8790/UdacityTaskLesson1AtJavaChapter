package OOP;

public class Encapsulation {
    private double radius;

    public Encapsulation() {
        radius = 1;
    }

    public Encapsulation(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if (r < 0) {
            radius = 1;
        } else {
            radius = r;
        }
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
