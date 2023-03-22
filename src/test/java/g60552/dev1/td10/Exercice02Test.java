package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice02Test {

    @Test
    void somme() {
        assertEquals(Exercice02.somme(5), 15, 0.01);
        assertEquals(Exercice02.somme(3), 6, 0.01);
        assertThrows(IllegalArgumentException.class, ()->Exercice02.somme(-5));
        assertEquals(Exercice02.somme(0), 0, 0.01);
    }
}