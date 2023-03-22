package g60552.dev1.td12;

public class MainExoBase {
    public static void main(String[] args) {
        int[][] tableau = { {4,  2,  3,   9},         // 0 1 2 3
                            {2,  3,  4, 115},         // 1
                            {3, 15, 19,   2},         // 2
                            {7,  1, 23,  22} };       // 3

        Arrays2D.afficherTab(tableau);
        System.out.println(Arrays2D.isAllPositive(tableau));
        System.out.println(Arrays2D.sumLineAndCol(tableau, 2, 1));
        var pasc = Arrays2D.trianglePascal(4);
        Arrays2D.afficherTab(pasc);
        Arrays2D.afficherMaxAndMin(tableau);
    }

}
