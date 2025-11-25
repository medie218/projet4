import java.util.ArrayList;

public class Pharmacie {
    private ArrayList<Medicament> stock = new ArrayList<>();

    public void ajouterMedicament(Medicament m) {
        stock.add(m);
        System.out.println("Ajouté: " + m.getCode());
    }

    public void afficherStock() {
        for (Medicament m : stock) {
            m.afficherInfos();
        }
    }

    public void modifierPrix(String code, double nouveauPrix) {
        for (Medicament m : stock) {
            if (m.getCode().equals(code)) {
                m.setPrix(nouveauPrix);
                System.out.println("Prix modifié.");
                return;
            }
        }
        System.out.println("Code introuvable.");
    }

    public void supprimerMedicament(String code) {
        stock.removeIf(m -> m.getCode().equals(code));
        System.out.println("Médicament supprimé.");
    }
}