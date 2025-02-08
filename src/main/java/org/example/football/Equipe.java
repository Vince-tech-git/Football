package org.example.football;

import org.example.football.entities.Joueur;
import org.example.football.entities.Ligue;

import java.util.ArrayList;
import java.util.List;


public class Equipe {

    private List<Joueur> joueurs = new ArrayList<>();
    private String nomEquipe;

    public Equipe(){}

    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public void afficheJoueur() {
        for (Joueur joueur : joueurs) {
            System.out.println(joueur.getNom());


        }
    }
    public void afficheNbPos() {
        int gard, def, mil, att ;
        gard = def = mil = att = 0;
        String jou;
        for (Joueur joueur : joueurs) {
            jou = joueur.getPoste();
            switch (jou) {
                case "Gardien" -> gard++;
                case "Defenseur" -> def++;
                case "Milieux" -> mil++;
                case "Attaquant" -> att++;
            }
        }
        affichePoste(gard,def,mil,att);
    }
    public void affichePoste(int gard ,int def, int mil , int att) {
        System.out.println("Il y a " + gard + " gardien " +
                    def + " defenseur " +
                    mil + " milieux " +
                    att + " attaquant ");
    }


}
