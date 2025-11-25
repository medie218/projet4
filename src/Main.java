public class Main {
    public static void main(String[] args) {
        Pharmacie pharmacie = new Pharmacie();

        Comprime c = new Comprime("Doliprane", "C001", 1500, "2026-12-01", 50, "500mg", 10, "effervescent", "toutes les 6h", "à l'abri de l'humidité");
        Sirop s = new Sirop("Toplexil", "S001", 2500, "2025-08-01", 30, 100, "framboise", true, "forte", "au frais");
        Pommade p = new Pommade("Fucidine", "P001", 3000, "2026-01-01", 20, 50, "peau", "crémeuse", "2x/jour", "température ambiante");
        Injection i = new Injection("VaccinX", "I001", 5000, "2027-03-01", 100, 0.5, "1x/mois", "auto-bloquante", "intramusculaire", "réfrigéré");

        pharmacie.ajouterMedicament(c);
        pharmacie.ajouterMedicament(s);
        pharmacie.ajouterMedicament(p);
        pharmacie.ajouterMedicament(i);

        pharmacie.afficherStock();
        pharmacie.modifierPrix("C001", 1800);
        pharmacie.supprimerMedicament("S001");
        pharmacie.afficherStock();
    }
}
