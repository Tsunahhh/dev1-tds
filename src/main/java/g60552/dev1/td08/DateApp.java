package g60552.dev1.td08;


public class DateApp {
    public static void main(String[] args) {



        //td 8 Exercice03
        int annee = DateUtil.lireAnnee("Annee: ");
        int mois = DateUtil.lireMois("Mois: ");

        DateUtil.afficherTitre(mois, annee);
        DateUtil.affichierEntete();
        int jours = DateUtil.nombreJours(mois, annee);
        int decalage = DateUtil.numeroJour(1, mois, annee);
        DateUtil.afficherMois(decalage, jours);
    }
}
