package lesson1;

import java.util.Scanner;

public class WelcomeUSer {
    public static void welcome(){
        System.out.println("Please Enter Your UserName");
        Scanner userName = new Scanner(System.in);
        String name = userName.next();
        userName.close();
        System.out.println("Welcome " + name + "!");
    }
    public static void main(String[] args)
    {
        welcome();
    }


}
