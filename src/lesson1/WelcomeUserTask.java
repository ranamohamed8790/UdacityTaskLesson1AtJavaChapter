package lesson1;

import java.util.Scanner;

public class WelcomeUserTask {
    public static void main(String[] args) {
        String [] name = new String[10];

        Scanner sc = new Scanner(System.in);

        for (int i =0; i<=10; i++) {
            System.out.println("Please Enter Your Name");
            name[0] = sc.nextLine();
            System.out.println("Welcome " + name[0]);




        }
        }
    }

