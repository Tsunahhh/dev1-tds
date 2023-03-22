package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice09 {
    public static void main(String[] args) {
        int hours, mins, secs, total;
        Scanner in = new Scanner(System.in);

        System.out.print("Heures: ");
        hours = in.nextInt();
        System.out.print("Mins: ");
        mins = in.nextInt();
        System.out.print("Secs: ");
        secs = in.nextInt();

        total = hours*3600 + mins*60 + secs;

        System.out.println(total + " secondes.");
    }
}
