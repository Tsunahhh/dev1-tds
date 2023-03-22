package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice04Test {

    @Test
    void estPalindrome() {
        assertTrue(Exercice04.estPalindrome("kayak"));
        assertTrue(Exercice04.estPalindrome("abcba"));
        assertTrue(Exercice04.estPalindrome("101101"));
        assertFalse(Exercice04.estPalindrome("table"));
        assertFalse(Exercice04.estPalindrome("556"));
    }
}