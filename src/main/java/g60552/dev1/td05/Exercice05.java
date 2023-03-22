package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String mot;

        System.out.print("Entrer un mot: ");
        mot = in.nextLine();

        for (int i = mot.length() - 1; i >= 0; i = i - 1) {
            System.out.print(mot.charAt(i));
        }
        
    }
}
