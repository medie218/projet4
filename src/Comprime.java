public class Comprime extends Medicament {
        private String dosage;
        private int nombreComprimes;
        private String typeComprime;
        private String intervallePrise;
        private String modeConservation;

        public Comprime(String nomCommercial, String code, double prix, String dateExpiration, int stock,
                        String dosage, int nombreComprimes, String typeComprime, String intervallePrise, String modeConservation) {
            super(nomCommercial, code, prix, dateExpiration, stock);
            this.dosage = dosage;
            this.nombreComprimes = nombreComprimes;
            this.typeComprime = typeComprime;
            this.intervallePrise = intervallePrise;
            this.modeConservation = modeConservation;
        }

        @Override
        public void afficherInfos() {
            System.out.println("Comprimé: " + nomCommercial + " | Dosage: " + dosage + " | Stock: " + stock);
        }

        public void afficherPosologie() {
            System.out.println("Prendre " + nombreComprimes + " comprimés " + intervallePrise + ". Conservation: " + modeConservation);
        }
    }
