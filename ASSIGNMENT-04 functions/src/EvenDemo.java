
//2. Write a method isEven(int n) that returns true if the number is even, otherwise false.

class EvenDemo {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(8));
    }
}
