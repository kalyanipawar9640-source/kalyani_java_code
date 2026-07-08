
//14.WAP using switch to calculate area (circle, square, rectangle, triangle)import java.util.Scanner;

import java.util.Scanner;

public class AreaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter Radius: ");
                double r = sc.nextDouble();
                System.out.println("Area = " + (3.14 * r * r));
                break;

            case 2:
                System.out.print("Enter Side: ");
                int side = sc.nextInt();
                System.out.println("Area = " + (side * side));
                break;

            case 3:
                System.out.print("Enter Length and Breadth: ");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Area = " + (l * b));
                break;

            case 4:
                System.out.print("Enter Base and Height: ");
                int base = sc.nextInt();
                int h = sc.nextInt();
                System.out.println("Area = " + (0.5 * base * h));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}