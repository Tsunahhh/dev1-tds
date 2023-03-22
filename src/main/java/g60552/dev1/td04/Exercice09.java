package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num, max, min;

        num = 0;
        max = -1;
        min = -1;

        while (num != -1) {

            System.out.print("Nombre positif: ");
            num = in.nextInt();

            if (num > max || max == -1)
                max = num;


            if (num < min || min == -1) {
                if (num != -1)
                    min = num;
            }

        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
