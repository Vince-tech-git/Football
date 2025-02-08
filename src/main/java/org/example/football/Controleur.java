package org.example.football;

import org.example.football.entities.*;


import java.util.Scanner;

public class Controleur {

    public static void start() {

        Gardiens gardien1 = new Gardiens("Gaetan",21,190,90,"Gardien",80,85,90);
        Gardiens gardien2 = new Gardiens("Geoffray",22,195,95,"Gardien",70,96,80);
        Defenseur defenseur1 = new Defenseur("David",23,180,85,"Defenseur",60,86,80);
        Defenseur defenseur2 = new Defenseur("Damien",24,182,88,"Defenseur",60,76,78);
        Milieux Milieux1 = new Milieux("Marc",25,180,85,"Milieux",60,75,80);
        Milieux Milieux2 = new Milieux("Marco",26,180,85,"Milieux",60,82,80);
        Milieux Milieux3 = new Milieux("Michel",27,180,85,"Milieux",60,83,80);
        Milieux Milieux4 = new Milieux("Michael",28,180,85,"Attaquant",60,80,80);
        Attaquant Attaquant1 = new Attaquant("Anthony",29,180,85,"Attaquant",70,86,80);
        Attaquant Attaquant2 = new Attaquant("Arthur",30,180,85,"Attaquant",75,86,80);

        Equipe equipe1 = new Equipe("Arsenal");
        Equipe equipe2 = new Equipe("City");
        equipe1.getJoueurs().add(gardien1);
        equipe1.getJoueurs().add(defenseur1);
        equipe1.getJoueurs().add(Milieux1);
        equipe1.getJoueurs().add(Milieux3);
        equipe1.getJoueurs().add(Attaquant1);
        equipe2.getJoueurs().add(gardien2);
        equipe2.getJoueurs().add(defenseur2);
        equipe2.getJoueurs().add(Milieux2);
        equipe2.getJoueurs().add(Milieux4);
        equipe2.getJoueurs().add(Attaquant2);

        Ligue ligue = new Ligue();
        ligue.getEquipes().add(equipe1);
        ligue.getEquipes().add(equipe2);

        Menu menu = new Menu(ligue);

        do {
            menu.choix();
        } while(wantToContinue());

    }
    public static boolean wantToContinue() {
        Scanner scanf = new Scanner(System.in);

        System.out.println(" Voulez-vous continuer :  y/n");
        String valeur =  scanf.nextLine();
        return  valeur.equals(("y"));
    }
}
