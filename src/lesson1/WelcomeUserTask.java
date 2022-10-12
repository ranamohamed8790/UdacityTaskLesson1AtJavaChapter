package lesson1;

import java.util.Scanner;

public class WelcomeUserTask {
    public static void main(String[] args) {
        String[] name = new String[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Please Enter " + (i + 1) + " Name");
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome " + name[i] + "\n");
        }
    }
}

