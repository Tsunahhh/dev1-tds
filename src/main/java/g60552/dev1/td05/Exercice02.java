package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char ch;

        System.out.print("Entrez mot: ");
        String mot = in.nextLine();
        ch = mot.charAt(0);

        System.out.print("La première lettre: ");
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'y' -> System.out.println(ch + " est une voyelle.");
            default -> System.out.println(ch + " n'est pas une voyelle.");
        }
    }
}
