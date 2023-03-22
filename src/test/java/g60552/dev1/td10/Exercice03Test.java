package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice03Test {

    @Test
    void estAnagramme() {
        assertTrue(Exercice03.estAnagramme("bonjour", "jourbon"));
        assertFalse(Exercice03.estAnagramme("été", "hiver"));
        assertFalse(Exercice03.estAnagramme("manger", "ranger"));
        assertTrue(Exercice03.estAnagramme("Verre", "Rever"));
    }
}