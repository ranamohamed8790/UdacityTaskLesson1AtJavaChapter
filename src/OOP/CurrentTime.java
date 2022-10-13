package OOP;

import java.util.Date;

public class CurrentTime {
    public static void main(String[] args){
        long time = System.currentTimeMillis();
        System.out.println("The Time is: " + time + "\n");

        Date date = new Date();
        //System.out.println("Current time = " + date);
        System.out.println("Current Date = " + date.getTime());
        System.out.println("Number = " + Math.random());

    }
}
