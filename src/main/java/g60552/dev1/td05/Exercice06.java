package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrer un mot: ");
        String mot = in.nextLine();
        char lettre;
        for (int i = 0; i < mot.length(); i = i + 1) {
            lettre = mot.charAt(i);
            if (lettre == 'a') {
                System.out.print(lettre);
            } else if (lettre == 'y') {
                System.out.print(lettre);
            } else if (lettre == 'u') {
                System.out.print(lettre);
            } else if (lettre == 'i') {
                System.out.print(lettre);
            } else if (lettre == 'o') {
                System.out.print(lettre);
            } else if (lettre == 'e') {
                System.out.print(lettre);
            }
        }
    }
}
