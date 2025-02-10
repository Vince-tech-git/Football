package org.example.football;

import org.example.football.entities.*;

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

    public void regen(Equipe equipe){
        for(Joueur joueur : joueurs) {

            System.out.println("nuit");
            String lui = joueur.getNom();
            int endu = joueur.getEndurance();
            System.out.println(lui+endu);
            if( endu <= 95 ) {
                endu = endu + 4;
                joueur.setEndurance(endu);
            }
            System.out.println(lui+endu);
        }
    }

    public void entrainement(Equipe equipe) {
        for(Joueur joueur : joueurs) {
            System.out.println("entrainement");
            String lui = joueur.getNom();
            int endu = joueur.getEndurance();
            System.out.println(lui+endu);
            if (endu >= 5) {
                endu = endu - 4;
                joueur.setEndurance(endu);
                System.out.println(lui + endu);
            }else{
                System.out.println("pas d'entrainement trop fatiguer");
            }
            if (joueur instanceof Gardiens g){
                int reflexe = g.getReflexe();
                if (reflexe <= 95){
                    reflexe = reflexe+5;
                    g.setReflexe(reflexe);
                    System.out.println("Reflexe+5");
                }
            }
            if (joueur instanceof Defenseur d){
                int tacle = d.getTacle();
                if (tacle <= 95){
                    tacle = tacle+5;
                    d.setTacle(tacle);
                    System.out.println("Tacle+5");
                }
            }
            if (joueur instanceof Milieux m){
                int passe = m.getPasse();
                if (passe <= 95){
                    passe = passe+5;
                    m.setPasse(passe);
                    System.out.println("Passe+5");
                }
            }
            if (joueur instanceof Attaquant a){
                int tir = a.getTir();
                if (tir <= 95){
                    tir = tir+5;
                    a.setTir(tir);
                    System.out.println("Tir+5");
                }
            }



        }
    }
}
