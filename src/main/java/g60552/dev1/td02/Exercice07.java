package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        int nb;
        Scanner in = new Scanner(System.in);

        System.out.println("Donnez un nombre entre 100 et 999: ");
        nb = in.nextInt();

        System.out.print(nb%10);
        System.out.print((nb/10)%10);
        System.out.print((nb/100)%10);
    }
}
