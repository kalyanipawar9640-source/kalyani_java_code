//Right-Aligned Character Triangle
public class RightCharacterPattern {
    public static void main(String[] args) {

        for(int i=1;i<=7;i++) {

            for(int s=7;s>i;s--)
                System.out.print("  ");

            char ch='A';

            for(int j=1;j<=i;j++) {
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
        }
    }
}