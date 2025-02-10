package org.example.football;




import org.example.football.entities.*;


import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private final Ligue ligue;
    Scanner scanf = new Scanner(System.in);

    public Menu(Ligue ligue) {
        this.ligue = ligue;
    }

    public void choix() {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lister tout les joueurs       : 1 ");
        System.out.println(" Compte des joueurs par equipe : 2 ");
        System.out.println(" Compte des joueurs par poste  : 3 ");
        System.out.println(" Ajouter une equipe            : 4 ");
        System.out.println(" Ajouter un joueur             : 5 ");
        System.out.println(" Changer ou ajouter a l'equipe : 6 ");
        System.out.println(" Passer une nuit               : 7 ");
        System.out.println(" Entrainement                  : 8 ");
        System.out.println(" Match du jour                 : 9 ");
        String valeur = scanner.nextLine();

        switch (valeur) {

            case "1":
                for (Equipe equipe : ligue.getEquipes()) {
                    equipe.afficheJoueur();
                }
                for (Joueur _ : ligue.getJoueursLibre()){
                    ligue.afficheJoueur();
                }
                break;
            case "2":
                    ligue.afficheTailleEquipe();
                break;
            case "3":
                for (Equipe equipe : ligue.getEquipes()) {
                    System.out.println(equipe.getNomEquipe());
                    equipe.afficheNbPos();
                }
                break;
            case "4":
                ligue.ajoutEquipe(encodeNom());

                break;
            case "5":

                Joueur ajout = encoderJoueur();

                ligue.ajoutJoueurLibre(ajout);
                break;
            case "6":
                System.out.println("Choix d'equipe : ");
                String equipe = encodeNom();
                Equipe result = ligue.getUneEquipe(equipe);
                System.out.println("choix du joueur : ");
                String joueurm = encodeNom();
                ligue.recruter(result,joueurm);
                break;
            case "7":
                for(Equipe e :ligue.getEquipes()){
                    ligue.nuit(e);
                }

                break;
            case "8":
                for(Equipe e :ligue.getEquipes()){
                    ligue.entrainement(e);
                }
                break;
            case "9":


                ligue.match(ligue.getUneEquipe("Arsenal"),ligue.getUneEquipe("City"));

                break;
            default:
                break;
        }
    }

    private Joueur encoderJoueur() {
        Joueur ajout = null;

        String nom = encodeNom();
        int poids = encodePoids();
        int age = encodeAge();
        int taille = encodeTaille();
        int endurance = encodeEndurence();
        int total = encodeTotal();
        String choixJou = choixJou();

        if (Objects.equals(choixJou, "Gardien")) {
            String poste = "Gardien";
            int reflexe = gardien();
            ajout = new Gardiens(nom, age, taille, poids, poste, endurance, total, reflexe);

        } else if (Objects.equals(choixJou, "Defenseur")) {
            String poste = "Defenseur";
            int tacle = defenseur();
            ajout = new Defenseur(nom, age, taille, poids, poste, endurance, total, tacle);

        } else if (Objects.equals(choixJou, "Milieux")) {
            String poste = "Milieux";
            int passe = milieux();
            ajout = new Milieux(nom, age, taille, poids, poste, endurance, total, passe);

        } else if (Objects.equals(choixJou, "Attaquant")) {
            String poste = "Attaquant";
            int tir = attaquant();
            ajout = new Attaquant(nom, age, taille, poids, poste, endurance, total, tir);

        }
        return ajout;
    }

    private String encodeNom() {
        System.out.println("Le nom : ");
        return scanf.next();
    }
    private int encodeAge(){
        System.out.println("L'age");
        return scanf.nextInt();
    }
    private int encodePoids(){
        System.out.println("Le poids  : ");
        return scanf.nextInt();
    }
    private int encodeTaille() {
        System.out.println("La taille  : ");
        return scanf.nextInt();
    }
    private int encodeEndurence() {
        System.out.println("L'endurence  : (0,100) ");
        return scanf.nextInt();
    }
    private int encodeTotal() {
        System.out.println("Total : (0,100)");
        return scanf.nextInt();
    }
    private String choixJou() {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Entrer le poste du joueur : (Gardien,Defenseur,Milieux,Attaquant");
        return scanf.next();
    }
    private int gardien() {
        System.out.println("Entrer la note des reflexe : (0,100)");
        return scanf.nextInt();
    }
    private int defenseur(){
        System.out.println("Entrer la note des tacles : (0,100)");
        return scanf.nextInt();
    }
    private int milieux() {
        System.out.println("Entrer la note des tacles : (0,100)");
        return scanf.nextInt();
    }
    private int attaquant() {
        System.out.println("Entrer la note des tacles : (0,100)");
        return scanf.nextInt();
    }
}