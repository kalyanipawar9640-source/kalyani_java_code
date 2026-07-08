//Number Pattern (Upper + Lower Triangle)

public class Pattern7 {
    public static void main(String[] args) {

        // Upper Triangle
        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }

        // Lower Triangle
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}