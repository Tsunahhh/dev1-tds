package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez une phrase: ");
        String chaineChar = in.nextLine();
        char firstChar = chaineChar.charAt(0);
        char lastChar = chaineChar.charAt(chaineChar.length()-1);
        boolean isFirstMaj = Character.isUpperCase(firstChar);
        if (isFirstMaj && lastChar == '.') {
            System.out.println("Ceci est une phrase.");
        } else {
            System.out.println("Ce n'est pas une phrase !");
        }
    }
}
