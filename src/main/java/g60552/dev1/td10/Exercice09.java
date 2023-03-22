package g60552.dev1.td10;

public class Exercice09 {
    public static int ppcm(int a, int b) {

        int ppcm, nb;
        ppcm = -1;
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("ERREUR: a et b doivent être plus grand que 0! a: " + a + " b:" + b);
        nb = a;
        while (ppcm == -1) {

            if (nb % a == 0 && nb % b == 0)
                ppcm = nb;
            nb = nb + 1;

        }



        return ppcm;
    }

    public static void main(String[] args) {

        System.out.println(ppcm(-15, 15));
    }
}
