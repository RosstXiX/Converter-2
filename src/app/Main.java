package app;

public class Main {
    private static final double RATIO = 0.62137;

    public static void main(String[] args) {
        System.out.println("Converter app");

        int mil = 2;
        System.out.printf("%d miles equals %.2f kilometers\n", mil, milToKm(mil));
        int km = 5;
        System.out.printf("%d kilometers equals %.2f miles\n", km, kmToMil(km));

    }

    private static double milToKm(double mil) {
        return mil / RATIO;
    }

    private static double kmToMil(double km) {
        return km * RATIO;
    }
}
