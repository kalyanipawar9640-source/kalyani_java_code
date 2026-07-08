//6. Reverse Character Pattern

public class Pattern6 {
    public static void main(String[] args) {
        for(int i=7;i>=1;i--) {
            char ch='A';
            for(int j=1;j<=i;j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}