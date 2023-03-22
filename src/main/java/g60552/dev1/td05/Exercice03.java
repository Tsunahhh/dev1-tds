package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Entrez mot: ");
        String mot = in.nextLine();

        char ch = mot.charAt(0);

        System.out.print("La premiere lettre: ");
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'y' -> System.out.println(ch + " n'est pas une consonne.");
            default -> System.out.println(ch + " est une consonne.");
        }

    }
}
