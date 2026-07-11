
//9. Write a method isArmstrong(int n) that checks whether a number is an Armstrong number.

class ArmstrongDemo {
    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}