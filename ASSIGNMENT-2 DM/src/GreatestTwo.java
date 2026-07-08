
//1. WAP to find the greatest of two numbers


import java.util.Scanner;

public class GreatestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greatest");
        } else {
            System.out.println(b + " is greatest");
        }
    }
}