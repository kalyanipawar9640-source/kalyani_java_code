
//15.WAP to Check Whether a Point Lies on X-Axis, Y-Axis, or Origin

import java.util.Scanner;

public class PointCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("Point lies at Origin");
        else if (y == 0)
            System.out.println("Point lies on X-Axis");
        else if (x == 0)
            System.out.println("Point lies on Y-Axis");
        else
            System.out.println("Point does not lie on any Axis");
    }
}