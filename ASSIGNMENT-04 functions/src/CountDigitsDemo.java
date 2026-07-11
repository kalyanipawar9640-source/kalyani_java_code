
//8. Write a method countDigits(int n) that returns the number of digits.

class CountDigitsDemo {
    static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }
}