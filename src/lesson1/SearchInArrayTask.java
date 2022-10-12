package lesson1;

import java.util.Scanner;

public class SearchInArrayTask {
    public static void main(String[] args) {
        int i = 0;
        int x;
        int arr[] = new int[10];

        for (i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter " + " Number" + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("\n" + "What is the entered Number?");
        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextInt();
        String found= "Sorry, The Value of " + x + " not found!";

        for (i = 0; i < 10; i++) {
            if (x == arr[i]) {
                found = "The Number is Found in array and Equal " + x;
                break;
            }

        }
        System.out.println(found);

    }
}
