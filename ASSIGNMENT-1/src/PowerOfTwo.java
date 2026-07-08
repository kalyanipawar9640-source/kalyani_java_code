
//Check Whether a Number is a Power of Two

public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;

        if ((num & (num - 1)) == 0)
            System.out.println(num + " is a Power of Two");
        else
            System.out.println(num + " is Not a Power of Two");
    }
}
