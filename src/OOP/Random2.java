package OOP;

import java.util.Random;

public class Random2 {
    public static void main(String[] args){
        int x=10;
        //Create Object from Random Class
        Random r1 = new Random();
        System.out.println("\n" + "The Range Number from Random class from 0 to 1000");
        for (int i=0; i<5; i++) {
            System.out.println(r1.nextInt(1000000));
        }
        System.out.println("\n" + "another range");
        for (int i=0; i<5; i++) {
            System.out.println(r1.nextInt(x));
        }


    }
}
