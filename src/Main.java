import java.time.Duration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("AB05", "UN AMOUR PERDU", "Samy", LocalDate.of(2015, 4, 8), true, 15);

        System.out.println(" ************************");
        System.out.println("          DOCUMENT       ");
        System.out.println(" ************************");
        System.out.println("Le code du document est " + document.getCode());
        System.out.println("Le tritre du document est: " + document.getTitre());
        System.out.println("L'auteur se nomme " + document.getAuteur());
        System.out.println("le document est-il disponible ?: " + document.isDisponibilite());
        System.out.println("Le document a été publié en " + document.getAnneePublication());
        System.out.println("Le document a " + document.getNbreexemplaire() + " exemplaires ");

        Livre livre = new Livre("AB02", "l'appel de la foret", "robin rorwood", LocalDate.of(2002, 4, 8), true, 200, 20);

        System.out.println(" ************************");
        System.out.println("          LIVRE          ");
        System.out.println(" ************************");
        System.out.println("Le Code du livre est" + livre.getCode());
        System.out.println("Le livre a pour titre:" + livre.getTitre());
        System.out.println("L'auteur se nomme " + livre.getAuteur());
        System.out.println("publié en " + livre.getAnneePublication());
        System.out.println(" Le livre est-il disponible? : " + livre.isDisponibilite());
        System.out.println("Le livre a " + livre.getNbrePages() + " pages");
        System.out.println("Le livre a " + livre.getNbreexemplaire() + " exemplaires");

        Magazine Magazine = new Magazine("AD09", "Le point", "Claude Imbert", LocalDate.of(1972, 5, 9), true, 27, 29);
        System.out.println(" ************************");
        System.out.println("          MAGAZINE       ");
        System.out.println(" ************************");
        System.out.println("Le Code du Magazine est " + Magazine.getCode());
        System.out.println("Le Magazine  a pour titre:" + Magazine.getTitre());
        System.out.println("L'auteur se nomme " + Magazine.getAuteur());
        System.out.println("publié en " + Magazine.getAnneePublication());
        System.out.println("Le Magazine  est-il disponible? : " + Magazine.isDisponibilite());
        System.out.println("Le Magazine a " + Magazine.getNbreexemplaire() + " exemplaires");
        System.out.println("c'est la " + Magazine.getNumedition() + "ème édition du Magazine");


        Journal journal = new Journal("AP09", "Le fil du réel ", "Loic du bois", LocalDate.of(2005, 9, 3), true, 45, LocalDate.of(2005, 9, 3));
        System.out.println(" ************************");
        System.out.println("          JOURNAL        ");
        System.out.println(" ************************");
        System.out.println("Code : " + journal.getCode());
        System.out.println("Titre : " + journal.getTitre());
        System.out.println("Le nom du livre est : " + journal.getAuteur());
        System.out.println("fait en : " + journal.getAnneePublication());
        System.out.println("est-il disponible : " + journal.isDisponibilite());
        System.out.println("combien d'exemplaire : " + journal.getNbreexemplaire());
        System.out.println("nombre de pages du livre : " + journal.getDateparution());


        Disque Disque  = new Disque("AT06", "Fragment d'ombre et de lumière ", "josh merlin", LocalDate.of(2011, 7, 1), true, 88, Duration.ofMinutes(45));
        System.out.println(" ************************");
        System.out.println("          DISQUE         ");
        System.out.println(" ************************");
        System.out.println("Le Code du disque est " + Disque .getCode());
        System.out.println("Le disque   a pour titre:" + Disque .getTitre());
        System.out.println("L'auteur se nomme " + Disque.getAuteur());
        System.out.println("publié en " + Disque.getAnneepublication());
        System.out.println("Le disque est-il disponible? : " + Disque.isDisponibilite());
        System.out.println("Le disque a " + Disque.getNbreexemplaire() + " exemplaires");
        System.out.println("Le disque a une durée de " + Disque.getDuree());

    }
}










