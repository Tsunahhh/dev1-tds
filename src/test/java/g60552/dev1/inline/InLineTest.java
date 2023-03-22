package g60552.dev1.inline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InLineTest {

    @Test
    void move() {
        // Déplacement simple ou il n'y a pas de bille entre.
        int[] gameBoard = {0, 0, 1, 0, 0, 0, 0, 0, 1};
        InLine.move(gameBoard, 2, 1);

        // Déplacement ou il y a une bille entre.
        int[] gameBoard2 = {3, 0, 1, 0, 0, 0, 0, 0, 1};
        InLine.move(gameBoard2, 0, 4);

        //Bille de départ hors du tableau
        int[] gameBoard3 = {3, 0, 1, 0, 0, 0, 0, 0, 1};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            InLine.move(gameBoard3, 50, 2);
        });

        int[] gameBoard4 = {3, 0, 1, 0, 0, 0, 0, 0, 1};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            InLine.move(gameBoard4, 1, 3);
        });

        int[] gameBoard5 = {3, 0, 1, 0, 0, 0, 0, 0, 1};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            InLine.move(gameBoard5, 1, 3);
        });
        int[] gameBoard6 = {3, 0, 1, 0, 0, 0, 0, 0, 1};
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            InLine.move(gameBoard6, 1, 2);
        });

        int[] gameBoard7 = {3, 0, 1, 4, 9, 5, 3, 0, 0};
        InLine.move(gameBoard7, 0, 7);
    }
}