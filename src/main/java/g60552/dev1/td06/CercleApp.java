package g60552.dev1.td06;

import java.util.Scanner;

public class CercleApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Rayon cercle: ");
        double rayon = in.nextDouble();

        double periCercle = MathUtil.perimetreCercle(rayon);
        double airCercle = MathUtil.aireCercle(rayon);

        System.out.println("Perimetre: " + periCercle);
        System.out.println("Aire: " + airCercle);

    }

}
