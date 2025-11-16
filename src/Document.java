import java.time.LocalDate;

public class Document {
    private String code;
    private String titre;
    private String auteur;
    private LocalDate anneepublication;
    private boolean disponibilite;
    public int nbreexemplaire;

    public Document(String code,  String titre, String auteur, LocalDate anneepublication, boolean disponibilite, int nbreexemplaire) {
        this.nbreexemplaire = nbreexemplaire;
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.anneepublication = anneepublication;
        this.disponibilite = disponibilite;

    }
    public Document() {}

    public void setCode(String code) {
        this.code = code;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setAnneepublication(LocalDate anneepublication) {
        this.anneepublication = anneepublication;
    }
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
    public void setNbreexemplaires(int nbreexemplaire) {
        this.nbreexemplaire = nbreexemplaire;
    }

    public String getCode() {
        return code;
    }
    public String getTitre() {
        return  titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public LocalDate getAnneePublication() {
        return anneepublication;
    }
    public boolean isDisponibilite() {
        return disponibilite;
    }
    public int getNbreexemplaire() {
        return nbreexemplaire;
    }
    public void description(){
        System.out.println("le titre est" + this.titre);
        System.out.println("code " + this.code);
        System.out.println("l'auteur s'appelle " + this.auteur);
        System.out.println("la disponibilité " + this.disponibilite);
        System.out.println("du " + this.anneepublication);
        System.out.println("li y a " + this.nbreexemplaire);
    }
}




