package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice01Test {

    @Test
    void max2Nb() {
        assertEquals(Exercice01.max2Nb(5, 9), 9, 0.01);
        assertEquals(Exercice01.max2Nb(15, 9), 15, 0.01);
        assertEquals(Exercice01.max2Nb(5, -9), 5, 0.01);
        assertEquals(Exercice01.max2Nb(0, 9), 9, 0.01);
        assertEquals(Exercice01.max2Nb(9, 9), 9, 0.01);
    }
}