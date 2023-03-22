package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Texte: ");
        String texte = in.nextLine();
        if (texte.equals("OK ESI"))
            System.out.println("Je vous écoute !");
        else
            System.out.println("Je n'ai pas compris !");
    }
}
