
//11. WAP to Find Largest Among Three Numbers Using Nested ?:

public class LargestNestedTernary {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        int largest = (a > b) ? ((a > c) ? a : c)
                              : ((b > c) ? b : c);

        System.out.println("Largest Number = " + largest);
    }
}