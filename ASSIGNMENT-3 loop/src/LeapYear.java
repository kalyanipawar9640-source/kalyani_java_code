
//14. Leap Years Between 1900 and 2100


public class LeapYear {
    public static void main(String[] args) {

        for(int year=1900; year<=2100; year++) {

            if((year%400==0) || (year%4==0 && year%100!=0))
                System.out.print(year + " ");
        }
    }
}