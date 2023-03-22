package g60552.dev1.td08;

public class test {
    public static void playDate(int mois, int annee) {
        DateUtil.afficherTitre(mois, annee);
        DateUtil.affichierEntete();
        int jours = DateUtil.nombreJours(mois, annee);
        int decalage = DateUtil.numeroJour(1, mois, annee);
        DateUtil.afficherMois(decalage, jours);
    }
    public static void main(String[] args) {

        int annee = DateUtil.lireAnnee("Annee: ");
        for (int mois = 1; mois <= 12; mois = mois + 1) {
            playDate(mois, annee);
        }

    }
}


