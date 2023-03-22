package g60552.dev1.td3;

import java.util.Scanner;

public class Exercice06 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Donnez 3 nombres.");
        System.out.print("a: ");
        a = in.nextDouble();
        System.out.print("b: ");
        b = in.nextDouble();
        System.out.print("c: ");
        c = in.nextDouble();

        if (a > c && a > b)
            System.out.println("a plus grand: " + a);
        else if (b > a && b > c)
            System.out.println("b plus grand: " + b);
        else if (c > a && c > b)
            System.out.println("c plus grand: " + c);

    }
}
