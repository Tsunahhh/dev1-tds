package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nb, i;

        i=0;
        while (i < 10) {

            System.out.print("Donnez un nombre: ");
            nb = in.nextInt();
            if (nb % 2 == 0)
                System.out.println("Pair !");
             else
                System.out.println("Impair !");
            i += 1;

        }
    }
}
