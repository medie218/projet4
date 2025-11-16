import java.time.Duration;
import java.time.LocalDate;

public class Disque extends Document{
    private String code;
    private String titre;
    private String auteur;
    private LocalDate anneepublication;
    private boolean disponibilite;
    private int nbreexemplaire;
    private Duration duree;


    public Disque(String code, String titre, String auteur, LocalDate anneepublication, boolean disponibilite, int nbreexemplaire, Duration duree) {
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.anneepublication = anneepublication;
        this.disponibilite = disponibilite;
        this.nbreexemplaire = nbreexemplaire;
        this.duree = duree;
    }
    public Disque() {}

    public void setCode(String code) {
        this.code = code;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setAnneepublication(LocalDate anneePublication) {
        this.anneepublication = anneePublication;
    }
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
    public void setNbreexemplaires(int nbreexemplaire) {
        this.nbreexemplaire = nbreexemplaire;
    }
    public void setDuree(Duration duree) {
        this.duree = duree;
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
    public LocalDate getAnneepublication() {
        return anneepublication;
    }
    public boolean isDisponibilite() {
        return disponibilite;
    }
    public int getNbreexemplaire() {
        return nbreexemplaire;
    }
    public Duration getDuree() {
        return duree;
    }
    public void description(){
        System.out.println("code " + this.code);
        System.out.println("le titre est" + this.titre);
        System.out.println("l'auteur s'appelle " + this.auteur);
        System.out.println("la disponibilité " + this.disponibilite);
        System.out.println("du " + this.anneepublication);
        System.out.println("li y a " + this.nbreexemplaire);
        System.out.println("le numéro de edition " + this.duree);
    }
}
