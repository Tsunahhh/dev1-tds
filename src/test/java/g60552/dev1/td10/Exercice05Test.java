package g60552.dev1.td10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice05Test {

    @Test
    void nbOccurences() {
        assertEquals(Exercice05.nbOccurences('a', "alpha"), 2);
        assertEquals(Exercice05.nbOccurences('z', "aspirateur"), 0);
        assertEquals(Exercice05.nbOccurences('p', "prosopopee"), 3);
        assertEquals(Exercice05.nbOccurences('P', "prosopopee"), 0);
        assertEquals(Exercice05.nbOccurences('A', "Alpha"), 1);
    }
}