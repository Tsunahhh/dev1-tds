package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {
        int cote, aireDuCarre;
        Scanner clavier = new Scanner(System.in);

        System.out.print("Longeur d un cote: ");

        cote = clavier.nextInt();
        aireDuCarre = 4*cote;

        System.out.print("Aire du carre: " + aireDuCarre);
    }

}
