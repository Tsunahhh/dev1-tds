package g60552.dev1.td3;

import java.util.Scanner;

public class Exercice01 {
    public static void main(String[] args) {

        int majeurAge, age;
        Scanner in = new Scanner(System.in);
        majeurAge = 18;

        System.out.print("Age: ");
        age = in.nextInt();

        if (age >= majeurAge)
            System.out.println("Vous êtes majeur.");

    }
}
