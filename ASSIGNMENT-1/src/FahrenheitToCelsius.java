//WAP to convert 66°F into Celsius
//Formula: C = (F - 32) × 5 / 9

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double f = 66;
        double c = (f - 32) * 5 / 9.0;

        System.out.println("Temperature in Celsius = " + c);
    }
}