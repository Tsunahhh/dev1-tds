package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice10Test {

    @Test
    void cesar() {
        assertEquals(Exercice10.cesar("a", 1), "b");
        assertEquals(Exercice10.cesar("z", 1), "a");
        assertEquals(Exercice10.cesar("abc", 23), "xyz");
        assertEquals(Exercice10.cesar("ABC", 23), "XYZ");
        assertThrows(IllegalArgumentException.class, () -> Exercice10.cesar("()", 5));
        assertThrows(IllegalArgumentException.class, () -> Exercice10.cesar("995", 5));
    }
}