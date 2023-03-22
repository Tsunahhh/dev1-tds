package g60552.dev1.td3;

import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {

        int nb;
        Scanner in = new Scanner(System.in);

        System.out.print("Donnez un nombre: ");
        nb = in.nextInt();

        if (nb % 2 == 0)
            System.out.println("Nombre est pair.");
        else
            System.out.println("Nombre impair.");

    }
}
