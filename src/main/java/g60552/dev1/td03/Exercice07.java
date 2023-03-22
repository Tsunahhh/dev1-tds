package g60552.dev1.td3;

import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {

        double c1, c2, c3;
        Scanner in = new Scanner(System.in);

        System.out.println("Donnez 3 cotes du triangle: ");
        System.out.print("c1: ");
        c1 = in.nextDouble();
        System.out.print("c2: ");
        c2 = in.nextDouble();
        System.out.print("c3: ");
        c3 = in.nextDouble();

        if (c3 == c2 && c2 == c1)
            System.out.println("Triangle equilateral.");
        else if (c1 == c2 || c2 == c3 || c1 == c3)
            System.out.println("Triangle isocele.");
        else
            System.out.println("Triangle quelconque.");

    }
}
