package inheritance;

import java.util.Date;

public abstract class GeoObjects extends Object {
    private String color = "White";
    private boolean filled;    /**Default Value is "False"*/
    private Date dateCreated;

    public GeoObjects() {
        dateCreated = new Date();
    }

    public GeoObjects(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Abstract Parent Class Parameter is: {Color= " +color + ", filled= "
                + filled+" , Created on= "+dateCreated+" }";
    }
    // abstract parent tell me what  to do



}
