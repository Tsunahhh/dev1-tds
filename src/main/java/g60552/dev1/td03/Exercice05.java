package g60552.dev1.td3;

import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();
        
        if (a % 2 == 0)
            System.out.println("a est divisible par 2 -> pair.");

        if (a % 2 == 1)
            System.out.println("a est impair");

        if (a % b == 0)
            System.out.println("a est divisible par b");

        if (a < b)
            System.out.println("a plus petit que b");

        if (a <= b && (a <= c))
            System.out.println("a est le minimum");

        if ((a < b && b < c) || (a > b && b > c))
            System.out.println("B se trouve strictement entre a et c");

    }
}
