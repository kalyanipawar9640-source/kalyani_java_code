
//15.Toggle the 3rd Bit of a Number

public class ToggleBit {
    public static void main(String[] args) {
        int num = 10;

        int result = num ^ (1 << 2);

        System.out.println("Original Number = " + num);
        System.out.println("After Toggling 3rd Bit = " + result);
    }
}