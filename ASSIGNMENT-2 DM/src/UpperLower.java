
//9. WAP to Check Whether a Character is Uppercase or Lowercase

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else
            System.out.println("Not an Alphabet");
    }
}
