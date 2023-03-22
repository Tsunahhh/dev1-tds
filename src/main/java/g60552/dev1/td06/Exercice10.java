package g60552.dev1.td06;


public class Exercice10 {
    public static void main(String[] args) {
        System.out.println("Nombre de voyelles et consonnes :");
        String mot = "azertyuiop";
        System.out.println(ChaineUtil.nombreVoyelles(mot) + " voyelles");
        System.out.println(ChaineUtil.nombreConsonnes(mot) + " consonnes");
    }
}
