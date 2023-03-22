package g60552.dev1.td06;

public class MathUtil {

    // Exercice01
    public static double perimetreCercle(double rayon) {
        return 2 * Math.PI * rayon;
    }

    public static double aireCercle(double rayon) {
        return Math.PI * rayon * rayon;
    }

    //Exercice03
    public static double min2(double a, double b) {
        double result = b;
        if (a < b) {
            result = a;
        }
        return result;
    }

    public static double min3(double a, double b, double c) {
        double minAB = min2(a, b);
        return min2(minAB, c);
    }

    //Exercice04
    public static double moyenne(double x, double y) {
        return (x + y) / 2;
    }

    //Exercice07
    public static boolean estDivisible(int a, int b) {
        return a%b == 0;
    }

    //Exercice08
    public static int abs(int nb) {
        int result = nb;
        if (result < 0) {
            result = -nb;
        }
        return result;
    }

    //Exercice09
    public static int unite(int nb) {
        return nb % 10;
    }

    public static int dizaine(int nb) {
        return nb / 10 % 10;
    }

    public static int centaine(int nb) {
        return nb / 100 % 10;
    }

    public static int miroir(int nb) {

        return centaine(nb) + dizaine(nb)*10 + unite(nb)*100;
    }

}
