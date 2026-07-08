//WAP to print number of weeks and remaining days from total days


public class WeeksAndDays {
    public static void main(String[] args) {
        int totalDays = 25;

        int weeks = totalDays / 7;
        int days = totalDays % 7;

        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining Days = " + days);
    }
}