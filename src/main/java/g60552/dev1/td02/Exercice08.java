package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice08 {
    public static void main(String[] args) {
        int sec, min, reste;
        Scanner in = new Scanner(System.in);

        System.out.println("Entrez le nb de sec changer en min: ");
        sec = in.nextInt();

        min = sec / 60;
        reste = sec % 60;

        System.out.println(sec + " secondes vaut " + min + " min " + reste + "s");

    }
}
