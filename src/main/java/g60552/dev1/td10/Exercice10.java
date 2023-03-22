package g60552.dev1.td10;

public class Exercice10 {

    public static String cesar(String texte, int decalage) {
        char c;
        int charInt;
        String result = "";

        for (int i = 0; i < texte.length(); i = i + 1) {

            c = texte.charAt(i);

            if (!Character.isAlphabetic(c))
                throw new IllegalArgumentException("ERREUR: le caractère doit être de l'alphabet a-z ou A-Z: " + c);

            if (Character.isUpperCase(c)) {

                // Pour les char en Majuscules
                charInt = (int) (c - 65);
                result = result + (char) ((charInt + decalage) % 26 + 65);

            } else {

                // Pour les char en minuscules
                charInt = (int) (c - 97);
                result = result + (char) ((charInt + decalage) % 26 + 97);

            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(cesar("COUCOU", 1));
        System.out.println(cesar("bonjourabcdef", 9));
    }
}
