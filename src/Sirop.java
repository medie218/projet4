public class Sirop extends Medicament {
        private double volume;
        private String gout;
        private boolean sucre;
        private String concentration;
        private String modeConservation;

        public Sirop(String nomCommercial, String code, double prix, String dateExpiration, int stock,
                     double volume, String gout, boolean sucre, String concentration, String modeConservation) {
            super(nomCommercial, code, prix, dateExpiration, stock);
            this.volume = volume;
            this.gout = gout;
            this.sucre = sucre;
            this.concentration = concentration;
            this.modeConservation = modeConservation;
        }

        @Override
        public void afficherInfos() {
            System.out.println("Sirop: " + nomCommercial + " | Volume: " + volume + "ml | Stock: " + stock);
        }

        public void afficherInstructions() {
            System.out.println("Goût: " + gout + ", Concentration: " + concentration + ", Sucré: " + sucre + ", Conservation: " + modeConservation);
        }
    }

