public abstract class Medicament {
        protected String nomCommercial;
        protected String code;
        protected double prix;
        protected String dateExpiration;
        protected int stock;

        public Medicament(String nomCommercial, String code, double prix, String dateExpiration, int stock) {
            this.nomCommercial = nomCommercial;
            this.code = code;
            this.prix = prix;
            this.dateExpiration = dateExpiration;
            this.stock = stock;
        }

        public abstract void afficherInfos();

        public void mettreAJourStock(int qte) {
            this.stock += qte;
        }
        public String getCode() { return code; }
        public double getPrix() { return prix; }
        public void setPrix(double prix) { this.prix = prix; }
    }

