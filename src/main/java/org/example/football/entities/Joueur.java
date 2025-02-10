package org.example.football.entities;

public class Joueur {
    private String nom;
    private int age ;
    private int taille;
    private int poids ;
    private String poste ;
    private int endurance ;
    private int total ;

    public Joueur() {

    }

    public Joueur(String nom, int age, int taille, int poids, String poste, int endurance, int total) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.poste = poste;
        this.endurance = endurance;
        this.total = total;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEquipe() {
        return nom;
    }

    public void setEquipe(String equipe) {
        this.nom = equipe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Joueur joueur = (Joueur) o;
        return age == joueur.age && taille == joueur.taille && poids == joueur.poids && endurance == joueur.endurance && total == joueur.total && nom.equals(joueur.nom) && poste.equals(joueur.poste);
    }

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + age;
        result = 31 * result + taille;
        result = 31 * result + poids;
        result = 31 * result + poste.hashCode();
        result = 31 * result + endurance;
        result = 31 * result + total;
        return result;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", taille=" + taille +
                ", poids=" + poids +
                ", poste='" + poste + '\'' +
                ", endurance=" + endurance +
                ", total=" + total +
                '}';
    }

}

