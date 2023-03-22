package g60552.dev1;

import java.util.Scanner;

public class Demo {
    public static String askToUser() {
        System.out.print("Veuillez entrer un groupe sanguin ?: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        while (!(input.equals("AB") || input.equals("B") || input.equals("A") || input.equals("O"))) {
            System.out.print("Desole ceci n'est pas un groupe sanguin\n Veuillez en taper un nouveau: ");
            input = in.next();
        }
        return input;
    }

    public static void main(String[] args) {
        String group1 = askToUser();
        String group2 = askToUser();
        String group3 = askToUser();
        System.out.println("Groupe 1 : " + group1);
        System.out.println("Groupe 2 : " + group2);
        System.out.println("Groupe 3 : " + group3);
    }
}

