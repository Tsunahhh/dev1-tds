package g60552.dev1.td12;

import java.util.Scanner;

public class DessinTriangleBas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Valeur n >= 2: ");
        int value = in.nextInt();
        for (int i = 0; i <= value+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
