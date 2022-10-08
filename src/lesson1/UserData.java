package lesson1;

import java.util.Scanner;

public class UserData {
    public static void enterYourData(){
        Scanner sc = new Scanner(System.in);

        //Enter and Print Your Name
        System.out.println("Please Enter Your Name");
        String name = sc.next();
        //System.out.println("Your Name is " + name + "\n");

        //Enter and Print Your Age
        System.out.println("Please Enter Your Age");
        int age = sc.nextInt();
       // System.out.println("Your Name is " + age + "\n");

        //Enter and Print Your Email
        System.out.println("Please Enter Your Email");
        String email = sc.next();
       // System.out.println("Your Name is " + email+ "\n");

        //Enter and Print Your Faculty
        System.out.println("Please Enter Your Faculty");
        String Faculty = sc.next();
       // System.out.println("Your Name is " + Faculty+ "\n");
        sc.close();

        System.out.println("Your Name is " + name);
        System.out.println("Your Name is " + age);
        System.out.println("Your Name is " + email);
        System.out.println("Your Name is " + Faculty);
    }
    public static void main(String[] args)
    {
        enterYourData();
    }

}
