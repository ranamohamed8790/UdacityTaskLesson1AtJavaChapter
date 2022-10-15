package inheritance;

import java.util.Date;

public class SimpleGeoObjects extends Object {
    private String color = "White";
    private boolean filled;    /**Default Value is "False"*/
    private Date dateCreated;

    public SimpleGeoObjects() {
        dateCreated = new Date();
    }

    public SimpleGeoObjects(String color, boolean filled) {
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
    public String toString(){
        return "Parent Class Parameter is: {Color= " +color + ", filled= "+ filled+" , Created on= "+dateCreated+" }";
    }

}
