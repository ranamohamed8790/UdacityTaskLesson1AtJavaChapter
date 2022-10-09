package lesson1;

import java.util.Scanner;

public class StringContainLast {
    public static void main(String[] args)
    {
        // Details of 1st User
        String str1 = new String();
        System.out.println("Please Enter your Name");
        Scanner sc1 = new Scanner(System.in);
        str1 = sc1.next();

        // Details of 1st User
        String str2 = new String();
        System.out.println("Please Enter your Name");
        Scanner sc2 = new Scanner(System.in);
        str2 = sc1.next();
        sc2.close();

        // Print the Result
        System.out.println(str1.contains(str2));
    }
}
