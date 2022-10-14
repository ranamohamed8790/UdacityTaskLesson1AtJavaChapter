package OOP;

public class CircleArea {
    double radius;
    static int numOfObjects=0;
    public CircleArea (){
        numOfObjects++;
        radius =1;
    }

    public CircleArea (double r){
        radius =r;
    }

    public static int getNumOfObjects(){
        return numOfObjects;
    }


    public double getArea(){
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        CircleArea a1= new CircleArea();
        CircleArea a2= new CircleArea(20);
        System.out.println(a1.radius);
        System.out.println(a1.radius=55);

        System.out.println(CircleArea.getNumOfObjects());

    }
    }