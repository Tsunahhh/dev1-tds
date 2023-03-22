package g60552.dev1.td06;

import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a est divisible par b ?");
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();

        if (MathUtil.estDivisible(a, b))
            System.out.println("a est bien divisible par b !");
        else
            System.out.println("a n'est pas divisible par b !");
    }
}
