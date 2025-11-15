import java.time.LocalDate;

public class Document {
    private String code;
    private String titre;
    private String auteur;
    private LocalDate anneepublication;
    private boolean disponibilite;
    public double nbreexemplaire;

    public Document(String code,  String titre, String auteur, LocalDate anneepublication, boolean disponibilite, double nbreexemplaire) {
        this.nbreexemplaire = nbreexemplaire;
        this.code = code;
        this.titre = titre;
        this.auteur = auteur;
        this.anneepublication = anneepublication;
        this.disponibilite = disponibilite;

    }
}



// Getters
public String getCode() {
    return code;
}
public String getTitre() {
    return titre;
}
public String getAuteur() {
    return auteur;
}
public LocalDate getAnneepublication() {
    return anneePublication;
}
public boolean getDisponibilite() {
    return disponibilite;
}
public int getNbreexemplaire() {
    return nbreexemplaire;
}
public  void setCode(String code){
    this.code;
}
public void setTitre(String titre){
    this.titre;
}
public void setAuteur(String auteur){
    this.auteur;
}
public void setAnneepublication(LocalDate anneepublication){
    this.anneepublication;
}
public void setDisponibilite(boolean disponibilite){
    this.disponibilite;
}
public void setNbreexemplaire(double nbreexemplaire){
    this.nbreexemplaire;
}