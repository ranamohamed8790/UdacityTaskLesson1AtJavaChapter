package lesson1;

import java.util.Scanner;

public class ArrayTaskSUm {
    public static void main(String[] args)
    {
        int [] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 1st Number");
        numbers [0] = sc.nextInt();
        System.out.println("Please Enter 2nd Number");
        numbers [1] = sc.nextInt();
        System.out.println("Please Enter 3rd Number");
        numbers [2] = sc.nextInt();
        System.out.println("Please Enter 4th Number");
        numbers [3] = sc.nextInt();
        System.out.println("Please Enter 5th Number");
        numbers [4] = sc.nextInt();
        sc.close();
        int total = numbers [0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println("The Total of Number = " + total);

    }
    }
