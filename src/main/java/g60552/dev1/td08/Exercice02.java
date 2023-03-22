package g60552.dev1.td08;

import java.util.Scanner;

public class Exercice02 {
    public static int lireEntier(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(message);
        while (!clavier.hasNextInt()) {
            clavier.next();
            System.out.println("Ceci n'est pas une entier !");
            System.out.print(message);
        }
        return clavier.nextInt();
    }
    public static double lireDouble(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(message);
        while (!clavier.hasNextDouble()) {
            clavier.next();
            System.out.println("Ceci n'est pas un double !");
            System.out.print(message);
        }
        return clavier.nextDouble();
    }
    public static int lireEntier2(String message, int min, int max) {
        int myInt = lireEntier(message);
        while ( myInt < min || myInt > max) {
            System.out.println("Entier non compris entre " + min + " et " + max + " inclu !");
            myInt = lireEntier(message);
        }
        return myInt;
    }

    public static void main(String[] args) {
        System.out.println(lireEntier2("Entrez un entier: ", 1, 31));
    }
}
