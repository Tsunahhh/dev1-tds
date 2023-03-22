package g60552.dev1.td06;

import java.util.Scanner;

public class Exercice04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Moyenne de 2 nb.");
        System.out.print("a: ");
        double nb1 = in.nextDouble();
        System.out.print("b: ");
        double nb2 = in.nextDouble();
        System.out.println("Le résultat est " + MathUtil.moyenne(nb1, nb2));
    }
}
