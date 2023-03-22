package g60552.dev1.td12;

public class Arrays2D {
    public static void afficherTab(int[][] tab) {
        for (int[] line : tab) {
            for (int entier : line) {
                System.out.print(entier + " ");
            }
            System.out.println();
        }
    }

    public static int proportionOfNuls(int[][] tab) {
        int cpt = 0;
        for (int [] line : tab) {
            for (int entier : line) {
                if (entier == 0) {
                    cpt++;
                }
            }

        }
        return cpt;
    }
    public static boolean isAllPositive(int[][] tab) {
        int i = 0;
        int j = 0;
        boolean isPos = true;
        while (i < tab.length && isPos) {
            while (j < tab[i].length && isPos) {
                isPos = (tab[i][j] > 0);
                j++;
            }
            j = 0;
            i++;
        }
        return isPos;
    }

    public static int sumLineAndCol(int[][] tab, int x, int y) {
        int sum = 0;
        for (int elem : tab[y]) {
            sum += elem;
        }
        for (int[] line : tab) {
            sum += line[x];
        }
        return sum;
    }

    public static int[][] trianglePascal(int n) {
        int[][] pascal = new int[n+1][];

        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i+1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < pascal[i].length-1; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }

        return pascal;
    }

    public static void afficherMaxAndMin(int[][] tab) {

        // [elem, position en x, position en y]

        int[] maxInfo = new int[3];
        int[] minInfo = new int[3];
        maxInfo[0] = tab[0][0];
        minInfo[0] = tab[0][0];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (maxInfo[0] < tab[i][j]) {
                    maxInfo[0] = tab[i][j];  // elem
                    maxInfo[1] = j;          // x
                    maxInfo[2] = i;          // y
                }

                if (minInfo[0] > tab[i][j]) {
                    minInfo[0] = tab[i][j];
                    minInfo[1] = j;
                    minInfo[2] = i;
                }
            }
        }
        System.out.println("Le minimum est : " + minInfo[0] + " en position (x:" + minInfo[1] + ", y:" + minInfo[2] + ")");
        System.out.println("Le maximum est : " + maxInfo[0] + " en position (x:" + maxInfo[1] + ", y:" + maxInfo[2] + ")");
    }
}
