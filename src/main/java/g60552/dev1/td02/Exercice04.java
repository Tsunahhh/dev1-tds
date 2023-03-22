package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice04 {
    public static void main(String[] args) {

        double pi, rayon, perimetre, aire;
        Scanner in = new Scanner(System.in);

        pi = 3.141593;
        System.out.println("Rayon du cercle: ");
        rayon = in.nextDouble();
        perimetre = 2 * pi * rayon;
        aire = 2 * pi * rayon * rayon;

        System.out.println("Le perimetre du cercle est " + perimetre + "cm");
        System.out.println("Son aire est de " + aire + "cm²");
    }
}
