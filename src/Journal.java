import java.time.LocalDate;

public class Journal extends Document {
    private String code;
    private String titre;
    private String auteur;
    private LocalDate anneepublication;
    private boolean disponibilite;
    private int nbreexemplaire;
    private LocalDate dateparution;


    public Journal(String code, String titre, String auteur, LocalDate anneepublication, boolean disponibilite, int nbreexemplaire, LocalDate dateParution) {
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.anneepublication = anneepublication;
        this.disponibilite = disponibilite;
        this.nbreexemplaire = nbreexemplaire;
        this.dateparution = dateparution;
    }
    public Journal() {}

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
    public void setNbreexemplaire(int nbreexemplaire) {
        this.nbreexemplaire = nbreexemplaire;
    }
    public void setDateparution(LocalDate dateparution) {
        this.dateparution = dateparution;
    }

    public  String getCode() {
        return code;
    }
    public String getTitre() {
        return  titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public LocalDate getAnneepublication() {
        return anneepublication;
    }
    public boolean isDisponibilite() {
        return disponibilite;
    }
    public int getNbreexemplaire() {
        return nbreexemplaire;
    }
    public LocalDate getDateparution() {
        return dateparution;
    }
    public void description(){
        System.out.println("code " + this.code);
        System.out.println("le titre est" + this.titre);
        System.out.println("l'auteur s'appelle " + this.auteur);
        System.out.println("la disponibilité " + this.disponibilite);
        System.out.println("du " + this.anneepublication);
        System.out.println("li y a " + this.nbreexemplaire);
        System.out.println("le numéro de edition " + this.dateparution);
    }
}
