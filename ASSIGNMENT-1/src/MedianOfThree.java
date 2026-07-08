
//10.Find the Median of Three Numbers Using Ternary Operator

public class MedianOfThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;

        int median = (a > b)
                ? ((b > c) ? b : (a > c ? c : a))
                : ((a > c) ? a : (b > c ? c : b));

        System.out.println("Median = " + median);
    }
}