package g60552.dev1.td11;

public class Exercice07 {
    public static void main(String[] args) {
        int[] tabEntier = {5, 3, 9, 6, 2, 1, 5, 9, 3};
        String[] tabChaine = {"manger", "boire", "dormir", "jouer", "courir", "marcher", "s'amuser", "se divertir"};
        double[] tabDouble = {5.5, 9.3, 3.3, 56.23, 123.7, -99.0, 78.023, 99.99};
        System.out.println(TableauUtil.min(tabDouble));
        System.out.println(TableauUtil.max(tabDouble));
        System.out.println(TableauUtil.somme(tabDouble));
        System.out.println(TableauUtil.moyenne(tabDouble));
        System.out.println(TableauUtil.copie(tabDouble) == tabDouble);
    }
}
