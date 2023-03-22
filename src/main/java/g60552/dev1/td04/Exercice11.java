package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, lastNum;
        boolean croissant;

        num = 0;
        lastNum = -1;
        croissant = true;

        while (num != -1) {
            System.out.print("Num: ");
            num = in.nextInt();

            if (num != -1) {
                if (lastNum > num)
                    croissant = false;
                else
                    lastNum = num;
            }
        }
        if (croissant)
            System.out.println("La série est strictement croissante.");
        else
            System.out.println("La série n'est pas strictement croissante.");
    }
}
