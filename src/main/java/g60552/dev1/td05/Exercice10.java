package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voy = 0, cons = 0;
        char ch;
        System.out.print("Compteur voyelles & consonnes: ");
        String chaineChar = in.nextLine();

        for (int i = 0; i < chaineChar.length(); i = i + 1) {
            ch = chaineChar.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ||ch=='y') {
                voy = voy + 1;
            } else if (ch != ' '){
                cons = cons + 1;
            }

        }
        System.out.println("Voyelles : " + voy + "\nConsonnes : " + cons);
    }
}
