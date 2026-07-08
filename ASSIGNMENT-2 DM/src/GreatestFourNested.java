
//4. WAP to find the greatest of four numbers.(using nested)


import java.util.Scanner;

public class GreatestFourNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println(a + " is greatest");
                } else {
                    System.out.println(d + " is greatest");
                }
            } else {
                if (c > d) {
                    System.out.println(c + " is greatest");
                } else {
                    System.out.println(d + " is greatest");
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    System.out.println(b + " is greatest");
                } else {
                    System.out.println(d + " is greatest");
                }
            } else {
                if (c > d) {
                    System.out.println(c + " is greatest");
                } else {
                    System.out.println(d + " is greatest");
                }
            }
        }
    }
}