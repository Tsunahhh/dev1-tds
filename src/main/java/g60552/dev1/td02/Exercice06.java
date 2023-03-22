package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice06 {
    public static void main(String[] args) {
        int nb;
        Scanner in = new Scanner(System.in);

        System.out.println("Nombre a decomposer: ");
        nb = in.nextInt();

        System.out.println(nb%10);
        System.out.println((nb/10)%10);
        System.out.println((nb/100)%10);
    }
}
