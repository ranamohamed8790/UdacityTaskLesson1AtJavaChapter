package lesson1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        int result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        number = sc.nextInt();


        for (int i =0; i<=10; i++){
            result = number * i;
            System.out.println("Result ="+ number + "*" + i + result);
        }
    }
}


