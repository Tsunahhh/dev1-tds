package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int voy = 0, cons = 0, i = 0;
        char ch;
        System.out.print("Compteur voyelles & consonnes: ");
        String chaineChar = in.nextLine();

        while (i < chaineChar.length()) {
            ch = chaineChar.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ||ch=='y') {
                voy = voy + 1;
            } else if (ch != ' '){
                cons = cons + 1;
            }
            i = i + 1;
        }

        System.out.println("Voyelles : " + voy + "\nConsonnes : " + cons);

        // Ex 11 avc While
        //Scanner in = new Scanner(System.in); -> on a déjà un Scanner :p
        System.out.print("Vérifier Palindrome: ");
        char char1, char2;
        boolean isPal = true;
        i = 0;                      // On remet le compteur à 0 pour l'exo
        String chainChar = in.nextLine();

        // Le while est plus efficace car on retire les boucles inutiles !
        while (i <= (chainChar.length()/2) && isPal) {
            char1 = chainChar.charAt(i);
            char2 = chainChar.charAt((chainChar.length()-1)-i);
            if (char1 != char2) {
                isPal = false;
            }
            i = i + 1;
        }
        if (isPal)
            System.out.println("C'est un palindrome !");
        else
            System.out.println("Ce n'est pas un palindrome !");
    }
}
