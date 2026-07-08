
//9. Print whether a number is Armstrong or not.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if(sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}