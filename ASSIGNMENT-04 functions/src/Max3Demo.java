
//5. Write a method max3(int a, int b, int c) that returns the largest number

class Max3Demo {
    static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println(max3(15, 40, 25));
    }
}