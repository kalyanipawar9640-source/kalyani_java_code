//Reverse Right Number Triangle

public class ReverseRightNumberPattern {
    public static void main(String[] args) {

        for(int i=7;i>=1;i--) {

            for(int s=7;s>i;s--)
                System.out.print("  ");

            for(int j=1;j<=i;j++)
                System.out.print(j+" ");

            System.out.println();
        }
    }
}