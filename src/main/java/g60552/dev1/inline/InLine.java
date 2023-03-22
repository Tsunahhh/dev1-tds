package g60552.dev1.inline;

import java.util.Scanner;

/**
 * Méthodes du jeu InLine.
 */
public class InLine {

    /**
     * Vérifie si la distance est bonne.
     * @param is plateau de jeu
     * @param from position de la bille à déplacer.
     * @param to position ou l'on veut déplacer la bille.
     * @return si il y a plus d'une bille entre ou pas.
     */
    public static boolean checkBalls(int[] is, int from, int to) {
        int cpt = 0;
        while (from != to && cpt < 2) {

            if (from < to) {
                from ++;
            } else {
                from --;
            }
            if (is[from] != 0) {
                cpt++;
            }
        }
        return cpt < 2;
    }

    /**
     * Déplacer une bille.
     * @param is tableau de jeu.
     * @param from position de la bille à déplacer.
     * @param to position ou l'on veut déplacer la bille
     */
    public static void move(int[] is, int from, int to) {

        if (from < 0 || from >= is.length) {
            throw new IllegalArgumentException("ERREUR: La position de départ est hors du tableau : " + from);
        } else if (to < 0 || to >= is.length) {
            throw new IllegalArgumentException("ERREUR: La position d'arrivée est hors du tableau : " + to);
        } else if (is[from] == 0) {
            throw  new IllegalArgumentException("ERREUR: La position de départ est nulle, pos: " + from);
        } else if (is[to] != 0) {
            throw new IllegalArgumentException("ERREUR: La case d'arrivée est déjà occupée par: " + is[to]);
        } else if (checkBalls(is, from, to)){
            is[to] = is[from];
            is[from] = 0;
        }
    }

    /**
     * Vérifier si il rester au moins 2 position.
     * @param is tableau de jeu.
     * @return true si il rester au moins 2 places.
     */
    private static boolean has2Places(int[] is) {
        int cpt = 0;
        int i = 0;
        while (i < is.length && cpt < 2) {
            if (is[i] == 0) {
                cpt++;
            }
            i++;
        }
        return i < is.length;
    }

    /**
     * Ajouter 2 billes aléatoire dans le tableau.
     * @param is le tableau de jeu.
     */
    public static void add2Balls(int[] is) {

        //              0        1
        // ballsParam [elem, position]

        if (has2Places(is)) {
            for (int i = 0; i < 2; i++) {
                int[] ballParam = {(int) ((Math.random() * 6) + 1), (int) (Math.random() * is.length)};
                while (is[ballParam[1]] != 0) {
                    ballParam[1] = (int) (Math.random() * is.length);
                }
                is[ballParam[1]] = ballParam[0];
            }
        }
    }

    /**
     * Afficher le plateau de jeu
     * @param is tableau de jeu
     */
    public static void display(int[] is) {

        String border = "";

        for (int i = 0; i < (is.length * 4) + 1; i++) {
            border += "-";
        }
        System.out.println(border);

        System.out.print("|");
        for (int j : is) {
            if (j != 0) {
                System.out.printf(" %d |", j);
            } else {
                System.out.print("   |");
            }
        }

        System.out.println("\n" + border);
        for (int i = 0; i < is.length; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();
    }

    /**
     * Supprime 3 billes de la même couleur collées.
     * @param is plateau de jeu.
     */
    public static void remove3InLine(int []is) {
        int cpt = 0;
        for (int i = 1; i < is.length; i++) {
            if (is[i] != 0 && is[i] == is[i-1]) {
                cpt++;
            } else {
                cpt = 0;
            }
            if (cpt == 2) {
                is[i-2] = 0;
                is[i-1] = 0;
                is[i] = 0;
            }
        }
    }

    /**
     * Lis 2 entier de manière robuste.
     * @param msg message à l'appel.
     * @return Un tableau contenant src et dst du déplacement.
     */
    public static int[] lire2Entier(String msg) {

        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        int from, to;

        while (!in.hasNextInt()) {
            in.next();
            System.out.print("ERREUR: Le <from> doit être un entier !\n <from> <to>: ");
        }
        from = in.nextInt();

        while (!in.hasNextInt()) {
            in.next();
            System.out.print("ERREUR: Le <to> doi être un entier !\n <to>: ");
        }

        to = in.nextInt();

        return new int[] {from, to};
    }

    /**
     * Vérifie si la partie est perdue.
     * @param is tableau de jeu.
     * @return true si la game continue
     */
    public static boolean isContinue(int[] is) {
        int cpt = 0;
        for (int elem : is) {
            if (elem == 0) {
                cpt ++;
            }
        }
        return cpt > 2;
    }

    public static void main() {
        int[] plateau = new int[20];
        int[] srcToDst;
        while (isContinue(plateau)) {
            add2Balls(plateau);
            display(plateau);
            srcToDst = lire2Entier("<from> <to> : ");
            move(plateau, srcToDst[0], srcToDst[1]);
            remove3InLine(plateau);
        }
    }
}