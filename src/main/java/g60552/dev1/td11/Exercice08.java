package g60552.dev1.td11;

public class Exercice08 {
    public static void main(String[] args) {
        int[] tabEntier = {5, 3, 9, 6, 2, 1, 5, 9, 7};
        String[] tabChaine = {"manger", "boire", "dormir", "jouer", "courir", "marcher", "s'amuser", "se divertir"};
        double[] tabDouble = {5.5, 9.3, 3.3, 56.23, 123.7, -99.0, 78.023, 99.99};
        double[] tabDoubleTrie = {3.3, 9.9, 11.0, 53.3, 66, 227.01};
        System.out.println(TableauUtil.indiceMax(tabDouble));
        System.out.println(TableauUtil.estTrie(tabDouble));
        System.out.println(TableauUtil.estTrie(tabDoubleTrie));
        System.out.println(TableauUtil.indice(tabEntier, 7));
        System.out.println(TableauUtil.indice(tabEntier, 11));
        System.out.println(TableauUtil.indice(tabEntier, 5));
        System.out.println(TableauUtil.contient(tabChaine, "se divertir"));
        System.out.println(TableauUtil.contient(tabChaine, "terminer"));
        System.out.println(TableauUtil.contient(tabDouble, 78.1, 0.1));
        System.out.println(TableauUtil.contient(tabDouble, 78.2, 0.1));
    }
}
