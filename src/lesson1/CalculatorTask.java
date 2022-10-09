package lesson1;

import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {
        // Identify the Variable
        int num1;
        int num2;
        String operation;

        // enter your number value
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Value 1");
        num1 = sc.nextInt();
        System.out.println("Please Enter Value 2");
        num2 = sc.nextInt();
        System.out.println("Please Enter Operation");
        operation = sc.next();

        int result;
        // Operation
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Result =" + num1 + operation + num2 + "=" + result);
    }
}
