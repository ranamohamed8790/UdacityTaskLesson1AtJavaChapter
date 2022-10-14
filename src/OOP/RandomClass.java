package OOP;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args){
        System.out.println("Print Random Number from Class of Math.Random");
        for (int i=0; i<5; i++){
            System.out.println(Math.random());
        }
        //Create Object from Random Class
        Random r1 = new Random();
        Random r2 = new Random();

        System.out.println("\n" +
                "The Range Number from Random class from 0 to 1000");
        for (int i=0; i<5; i++) {
            System.out.println(r1.nextInt(1000000));
        }

    }
}
