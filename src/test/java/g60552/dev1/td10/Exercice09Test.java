package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice09Test {

    @Test
    void ppcm() {
        assertEquals(Exercice09.ppcm(21, 15), 105, 0.001);
        assertEquals(Exercice09.ppcm(15, 15), 15, 0.001);
        assertThrows(IllegalArgumentException.class, () -> Exercice09.ppcm(-15, 15));
    }
}