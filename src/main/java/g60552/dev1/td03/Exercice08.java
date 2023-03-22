package g60552.dev1.td3;

public class Exercice08 {
    public static void main(String[] args) {

        System.out.println(9.99 == 10.0); // false
        System.out.println(9.999999999999999999999999 == 10.0); // true
        System.out.println(9.999999999999999999999999 == 10.00000000000001); // false
        System.out.println(true); //true
        System.out.println(false); // false
        System.out.println(!true); // false
        System.out.println(!false); // false
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

    }
}
