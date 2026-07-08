
//5. Left Triangle Character Pattern

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++) {
            char ch='A';
            for(int j=1;j<=i;j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}