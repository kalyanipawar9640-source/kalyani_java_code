
//13.Rotate Bits Left and Right


public class BitRotation {
    public static void main(String[] args) {
        int num = 8;

        int leftRotate = num << 1;
        int rightRotate = num >> 1;

        System.out.println("Original Number = " + num);
        System.out.println("Left Shift = " + leftRotate);
        System.out.println("Right Shift = " + rightRotate);
    }
}
