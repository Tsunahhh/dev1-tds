package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice07 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        String texte1 = "Bonjour";
        String texte2 = "Bonjour";
        String texte3 = "Bon";
        String texte4 = "jour";
        String texte5 = texte3+texte4;
        String texte6 = clavier.nextLine();

        System.out.println(texte1 + " == " + texte2 + " ? " + (texte1==texte2));
        System.out.println(texte1 + " == " + texte5 + " ? " + (texte1==texte5));
        System.out.println(texte1 + " == " + texte6 + " ? " + (texte1==texte6));

        System.out.println(texte1 + " equals " + texte2 + " ? " + texte1.equals(texte2));
        System.out.println(texte1 + " equals " + texte5 + " ? " + texte1.equals(texte5));
        System.out.println(texte1 + " equals " + texte6 + " ? " + texte1.equals(texte6));
    }
}
