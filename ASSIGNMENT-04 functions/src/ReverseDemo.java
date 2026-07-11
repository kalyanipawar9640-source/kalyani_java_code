
//7. Write a method reverse(int n) that returns the reverse of a number.

class ReverseDemo {
    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}