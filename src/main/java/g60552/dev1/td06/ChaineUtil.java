package g60552.dev1.td06;

import java.util.Scanner;

public class ChaineUtil {

    // Exercice05
    public static char premiereLettre(String mot) {
        return mot.charAt(0);
    }
    public static char derniereLettre(String mot) {
        return mot.charAt(mot.length()-1);
    }

    // Exercice10
    public static int nombreVoyelles(String mot) {
        int count;
        char ch;
        count = 0;
        for (int i = 0; i < mot.length(); i = i + 1) {
            ch = mot.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o') {
                count = count + 1;
            }
        }
        return count;
    }
    public static int nombreConsonnes(String mot) {
        int count = 0;
        char ch;
        for (int i = 0; i < mot.length(); i = i + 1) {
            ch = mot.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o')) {
                count = count + 1;
            }
        }
        return count;
    }

    //Exercice11
    public static boolean estPalindrome(String mot) {
        char char1, char2;
        boolean isPal = true;
        String chainChar = mot;
        for (int i = 0; i <= (chainChar.length()/2); i = i + 1) {
            char1 = chainChar.charAt(i);
            char2 = chainChar.charAt((chainChar.length()-1)-i);
            if (char1 != char2) {
                isPal = false;
            }
        }
        return isPal;
    }

}
