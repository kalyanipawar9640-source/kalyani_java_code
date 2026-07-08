
//WAP Using Switch to Convert Units (km to m, m to cm, cm to mm)

import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Kilometer to Meter");
        System.out.println("2. Meter to Centimeter");
        System.out.println("3. Centimeter to Millimeter");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        switch(choice) {
            case 1:
                System.out.println("Meters = " + (value * 1000));
                break;

            case 2:
                System.out.println("Centimeters = " + (value * 100));
                break;

            case 3:
                System.out.println("Millimeters = " + (value * 10));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}