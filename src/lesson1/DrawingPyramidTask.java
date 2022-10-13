package lesson1;

import java.util.Scanner;

public class DrawingPyramidTask {
    public static void main(String[] args) {
        String[] x = new String[5];
        for (int i=0; i<5; i ++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Your Value");
            x[i] = sc.nextLine();
        }
        System.out.println("Value of Pyramid is ");

        for (int i=0; i<5; i ++){

            System.out.println( x[i]);

        }

    }
    }
