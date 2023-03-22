package g60552.dev1.td12;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Num 1: ");
        int num1 = in.nextInt();
        System.out.print("Num 2: ");
        int num2 = in.nextInt();

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
