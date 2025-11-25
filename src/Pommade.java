public class Pommade extends Medicament {
        private double quantite;
        private String zoneApplication;
        private String texture;
        private String frequenceApplication;
        private String modeConservation;

        public Pommade(String nomCommercial, String code, double prix, String dateExpiration, int stock,
                       double quantite, String zoneApplication, String texture, String frequenceApplication, String modeConservation) {
            super(nomCommercial, code, prix, dateExpiration, stock);
            this.quantite = quantite;
            this.zoneApplication = zoneApplication;
            this.texture = texture;
            this.frequenceApplication = frequenceApplication;
            this.modeConservation = modeConservation;
        }

        @Override
        public void afficherInfos() {
            System.out.println("Pommade: " + nomCommercial + " | Quantité: " + quantite + "g | Stock: " + stock);
        }

        public void afficherApplication() {
            System.out.println("Appliquer sur: " + zoneApplication + ", Fréquence: " + frequenceApplication + ", Conservation: " + modeConservation);
        }
    }

