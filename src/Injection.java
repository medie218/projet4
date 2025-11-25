public class Injection extends Medicament {
    private double volumeParDose;
    private String frequenceInjection;
    private String typeSeringue;
    private String voieAdministration;
    private String modeConservation;

    public Injection(String nomCommercial, String code, double prix, String dateExpiration, int stock,
                     double volumeParDose, String frequenceInjection, String typeSeringue, String voieAdministration, String modeConservation) {
        super(nomCommercial, code, prix, dateExpiration, stock);
        this.volumeParDose = volumeParDose;
        this.frequenceInjection = frequenceInjection;
        this.typeSeringue = typeSeringue;
        this.voieAdministration = voieAdministration;
        this.modeConservation = modeConservation;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Injection: " + nomCommercial + " | Dose: " + volumeParDose + "ml | Stock: " + stock);
    }

    public void afficherModeAdministration() {
        System.out.println("Fréquence: " + frequenceInjection + ", Seringue: " + typeSeringue + ", Voie: " + voieAdministration + ", Conservation: " + modeConservation);
    }
}


