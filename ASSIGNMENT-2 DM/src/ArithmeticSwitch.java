
//13. WAP Using Switch to Perform Arithmetic Operations

import java.util.Scanner;

public class ArithmeticSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}