package g60552.dev1.td5;

// Palindrome

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vérifier Palindrome: ");
        char char1, char2;
        boolean isPal = true;
        String chainChar = in.nextLine();
        for (int i = 0; i <= (chainChar.length()/2); i = i + 1) {
            char1 = chainChar.charAt(i);
            char2 = chainChar.charAt((chainChar.length()-1)-i);
            if (char1 != char2) {
                isPal = false;
            }
        }
        if (isPal)
            System.out.println("C'est un palindrome !");
        else
            System.out.println("Ce n'est pas un palindrome !");
    }

}
