package app;

public class Main {
    private static final double RATIO = 0.62137;

    public static void main(String[] args) {
        System.out.println("Converter app");

        int mil = 2;
        System.out.printf("%d miles equals %.2f kilometers", mil, milToKm(mil));

    }

    private static double milToKm(double mil) {
        return mil / RATIO;
    }
}
