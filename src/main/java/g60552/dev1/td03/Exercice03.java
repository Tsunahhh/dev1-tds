package g60552.dev1.td3;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {

        double a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Comparer 2 nombres : ");
        System.out.print("a: ");
        a = in.nextDouble();
        System.out.print("b: ");
        b = in.nextDouble();

        if (a > b)
            System.out.println(a+"le plus grand");
        else if (b > a)
            System.out.println(b+"le plus grand");
        else
            System.out.println("Egalite : " + a + " = " + b);

    }
}
