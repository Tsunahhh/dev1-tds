package g60552.dev1.td10;

public class Exercice01 {

    public static int max2Nb(int a, int b) {
        return (a >= b) ?  a :  b;
    }

    /*
    * n du test:     Entrées:      sortie:
    *     1          a:5 b:8          8
    * */
    public static void main(String[] args) {
        System.out.println(max2Nb(5, 8)); // test 1 doit retourner 8
        System.out.println(max2Nb(9, 3)); // test 2 doit retourner 9
        System.out.println(max2Nb(6, 5)); // test 3 doit retourner 6
    }
}
