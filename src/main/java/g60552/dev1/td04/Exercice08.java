package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num, max;

        num = 0;
        max = -2;

        while (num != -1) {
            System.out.print("Entrez nombre: ");
            num = in.nextInt();

            if (num >= max)
                max = num;
        }

        System.out.println("Le max est " + max);
    }
}
