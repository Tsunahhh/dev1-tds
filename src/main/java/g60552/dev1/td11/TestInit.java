package g60552.dev1.td11;

public class TestInit {

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
            System.out.print(bool + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] tabEntier = new int[10];
        afficherTab(tabEntier);
        double[] tabDouble = new double[10];
        afficherTab(tabDouble);
        boolean[] tabBoolean = new boolean[10];
        afficherTab(tabBoolean);
        String[] tabString = new String[10];
        afficherTab(tabString);
    }
}
