package org.example.football.entities;

import org.example.football.Equipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ligue {

    private List<Equipe> equipes = new ArrayList<>();
    private List<Joueur> joueursLibre = new ArrayList<>();

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void afficheTailleEquipe() {
        for (Equipe equipe : equipes) {
            System.out.println(equipe.getJoueurs().size());
        }
    }

    public void ajoutEquipe(String s) {

        Equipe ajout = new Equipe(s);
        equipes.add(ajout);
    }


    public List<Joueur> getJoueursLibre() {
        return joueursLibre;
    }

    public void setJoueursLibre(List<Joueur> joueursLibre) {
        this.joueursLibre = joueursLibre;
    }

    public void ajoutJoueurLibre(Joueur ajout) {
        joueursLibre.add(ajout);
    }

    public void afficheJoueur() {
        /*for (Joueur joueur : joueursLibre) {
            System.out.println(joueur.getNom());


        }*/
        joueursLibre.forEach(joueur -> System.out.println(joueur.getNom()));
    }

    public Equipe getUneEquipe(String nom) {
        for (Equipe equipe : equipes) {
            if (nom.equals(equipe.getNomEquipe())) {
                return equipe;
            }
        }
        return null;
    }

    public void recruter(Equipe equipe, String nom) {
        Joueur joueur = null;
        for (Joueur j : joueursLibre) {
            if (nom.equals(j.getNom())) {
                joueur = j;
            }
        }
        if (joueur != null) {
            equipe.getJoueurs().add(joueur);
            joueursLibre.remove(joueur);
            return;
        }
        for (Equipe equip : equipes) {
            if (equipe.getNomEquipe().equals(equip.getNomEquipe())){
                continue;
            }
            for (Joueur j : equip.getJoueurs()){
                if(nom.equals(j.getNom())){
                    joueur = j ;
                }
            }
            if (joueur != null){
                equip.getJoueurs().remove(joueur);
                equipe.getJoueurs().add(joueur);
                return;
            }
        }
    }
    public void nuit (Equipe equipe){
        equipe.regen(equipe);
        System.out.println("zzzzzz");
    }
    public void entrainement(Equipe e){
        e.entrainement(e);
        System.out.println("++++++");

    }
    public void match(Equipe equipe1, Equipe equipe2){
        Random random = new Random();
        int nb1;
        int nb2;
        nb1= random.nextInt(0,50);
        nb2= random.nextInt(0,100);
        if (nb1 >= nb2) {
        System.out.println("L'equipe 2 a gagner "+equipe2.getNomEquipe()+ equipe2.getJoueurs());
        } else {
            System.out.println("L'equipe 1 a gagner "+equipe1.getNomEquipe()+equipe1.getJoueurs());
        }
    }
}