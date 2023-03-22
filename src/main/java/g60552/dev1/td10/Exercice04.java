package g60552.dev1.td10;

public class Exercice04 {
    /* Palindrome Plan Test:
    * Test:      mot:         doit retourner(bool):
    * 1          kayak            true
    * 2          table            false
    * 3          abcba            true
    * 4          101101           true
    * 5          556              false
    */
    public static boolean estPalindrome(String mot) {
        boolean estPal = true;
        for (int i = 0; i < (mot.length()/2 + 1); i++) {
            char ch1, ch2;
            ch1 = mot.charAt(i);
            ch2 = mot.charAt(mot.length() -1 - i);
            if (ch1 != ch2) {
                estPal = false;
            }
        }
        return estPal;
    }

    public static void main(String[] args) {

        System.out.println(estPalindrome("kayak")); // true
        System.out.println(estPalindrome("table")); // false
        System.out.println(estPalindrome("abcba")); // true
        System.out.println(estPalindrome("101101")); // true
        System.out.println(estPalindrome("556")); // false
    }
}
