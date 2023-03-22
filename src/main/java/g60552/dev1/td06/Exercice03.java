package g60552.dev1.td06;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Minimum de 2 nombres.");
        System.out.print("a: ");
        double nb1 = in.nextDouble();
        System.out.print("b: ");
        double nb2 = in.nextDouble();
        System.out.println("Le min est " + MathUtil.min2(nb1, nb2));
        System.out.println("Minimum de 3 nombres.");
        System.out.print("c: ");
        double nb3 = in.nextDouble();
        System.out.println("Le min est " + MathUtil.min3(nb1, nb2, nb3));
    }
}
