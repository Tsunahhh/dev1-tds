package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, first, last;

        first = -1;
        last = -1;

        do {
            System.out.print("Num: ");
            num = in.nextInt();

            if (first == -1)
                first = num;
            if (num != -1)
                last = num;
        } while (num != -1);

        if (last == -1)
            System.out.println("Série vide !");
        else if (last == first)
            System.out.println("Le premier est égal au dernier.");
        else if (first < last )
            System.out.println("Le premier est inférieur au dernier.");
        else
            System.out.println("Le premier est supérieur au dernier.");

    }
}
