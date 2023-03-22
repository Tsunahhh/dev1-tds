public class test {
    public static double nbSecEnKm(double nbMin, double nbSec, double dist) {
        return 3600 / (nbSec + nbMin * 60) * (1/dist);
    }
    public static void main(String[] args) {
        System.out.println(nbSecEnKm(4, 37, 1) + " km/h");
    }
}
