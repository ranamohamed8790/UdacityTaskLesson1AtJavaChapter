package lesson1;

import java.util.Scanner;

public class StringEqualTask {
    public static void main(String[] args)
    {
        // Details of 1st User
        String firstUser = new String();
        System.out.println("Please Enter your Name");
        Scanner sc1 = new Scanner(System.in);
        firstUser = sc1.next();

        // Details of 1st User
        String secondUser = new String();
        System.out.println("Please Enter your Name");
        Scanner sc2 = new Scanner(System.in);
        secondUser = sc1.next();
        sc2.close();

        // Print the Result
        System.out.println(firstUser.equals(secondUser));
    }

}
