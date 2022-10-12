package lesson1;

import java.util.Scanner;

public class CalculateAverageOfArrayElement {
    public static void main(String[] args) {

        int i=0;
        int total =0;
        int average=0;

        Scanner sc = new Scanner(System.in);
        for (i=0; i < 10  ; i++) {
            int arr[] = new int[10];
            System.out.println("Please Enter " + " Number" + (i + 1));
            arr[i] = sc.nextInt();
            total += arr[i];
            average = total / 10;

        }

        System.out.println("The Total of Element Array = " + total);
        System.out.println("The average of Element Array = " + average);

    }
}
