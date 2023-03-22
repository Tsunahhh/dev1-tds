package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice08Test {

    @Test
    void pgcd() {
        assertEquals(Exercice08.pgcd(6, 9), 3, 0.001);
        assertEquals(Exercice08.pgcd(5, 7), 1, 0.001);
        assertThrows(IllegalArgumentException.class, () -> Exercice08.pgcd(-5, -7));
    }
}