package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int first, last, num;

        first = -1;
        last = -1;
        num = 0;

        while (num != -1) {
            last = num;
            System.out.print("Entrez une valeur: ");
            num = in.nextInt();

            if (first == -1)
                first = num;
        }

        System.out.println("Premier: " + first);
        System.out.println("Dernier: " + last);
    }
}
