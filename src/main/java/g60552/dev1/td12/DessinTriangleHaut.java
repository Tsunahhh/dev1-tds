package g60552.dev1.td12;

import java.util.Scanner;

public class DessinTriangleHaut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n > 2: ");
        int value = in.nextInt();
        value++;
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j < value; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
