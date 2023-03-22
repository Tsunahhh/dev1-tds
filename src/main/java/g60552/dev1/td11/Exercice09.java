package g60552.dev1.td11;

public class Exercice09 {

    public static void afficherTab(int[] tab) {
        for (int elem : tab) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void afficherTab(double[] tab) {
        for (double elem: tab) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void afficherTab(String[] tab) {
        for (String mot : tab) {
            System.out.print(mot + " ");
        }
        System.out.println();
    }

    public static void afficherTab(boolean[] tab) {
        for (boolean bool : tab) {
            System.out.println(bool + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] aUnDouble = {1, 2, 3, 4, 5, 6, 9, 5};
        int[] pasDeDouble = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        double[] tabDoubles = {-1, 5.23, 9.34, 3.14, -8.4, -99.99, 123.01};
        double[] tab2Doubles = {-99.99, -99.99, 123.01, -99.99, -99.99};
        System.out.println(TableauUtil.doublons(aUnDouble));
        System.out.println(TableauUtil.doublons(pasDeDouble));
        System.out.println(TableauUtil.nbNegatifs(tabDoubles));
        TableauUtil.echange(tabDoubles, 0, 5);
        afficherTab(tabDoubles);
        TableauUtil.inverser(tabDoubles);
        afficherTab(tabDoubles);
        afficherTab(TableauUtil.indicesMin(tabDoubles));
        afficherTab(TableauUtil.indicesMin(tab2Doubles));


    }
}
