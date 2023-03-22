package g60552.dev1.td06;

import java.util.Scanner;

public class Exercice09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nombre 3 chiffres: ");
        int nb = in.nextInt();
        System.out.println("Unite: " + MathUtil.unite(nb));
        System.out.println("Dizaine: " + MathUtil.dizaine(nb));
        System.out.println("Centaine: " + MathUtil.centaine(nb));
        System.out.println("Miroir: " + MathUtil.miroir(nb));
    }
}
