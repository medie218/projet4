import java.time.LocalDate;

    public class Livre extends Document {
        private String code;
        private String titre;
        private String auteur;
        private LocalDate anneepublication;
        private boolean disponibilite;
        private int nbreexemplaire;

        private int nbrePages;

        public Livre(String code, String titre, String auteur, LocalDate anneepublication, boolean disponibilite, int nbrePages, int nbreexemplaire) {
            this.code = code;
            this.titre = titre;
            this.auteur = auteur;
            this.anneepublication = anneepublication;
            this.disponibilite = disponibilite;
            this.nbreexemplaire = nbreexemplaire;
            this.nbrePages = nbrePages;


        }

        public Livre() {
        }

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

        public void setNbreexemplaires(int nbreexemplaire) {
            this.nbreexemplaire = nbreexemplaire;
        }
        public void setDisponibilite(boolean disponibilite) {
            this.disponibilite = disponibilite;
        }

        public void setNbrePages(int nbrePages) {
            this.nbrePages = nbrePages;
        }

        public String getCode() {
            return code;
        }

        public String getTitre() {
            return titre;
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


        public int getNbrePages() {
            return nbrePages;
        }
        public void description(){
            System.out.println("Code : " + this.code);
            System.out.println("Titre : " + this.titre);
            System.out.println("Auteur : " + this.auteur);
            System.out.println("Annee Publication : " + this.anneepublication);
            System.out.println("Nbre Exemplaires : " + this.nbreexemplaire);
            System.out.println("est il disponible: " + this.disponibilite);
            System.out.println("Nbre Pages : " + this.nbrePages);
        }

    }




