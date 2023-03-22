package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {

        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("a: ");
        a = in.nextInt();
        System.out.println("b: ");
        b = in.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*a + b*b);

    }
}
