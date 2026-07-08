
//Find Absolute Value Using Ternary Operator

public class AbsoluteValue {
    public static void main(String[] args) {
        int num = -15;

        int abs = (num < 0) ? -num : num;

        System.out.println("Absolute Value = " + abs);
    }
}