package org.example.football.entities;

public class Defenseur extends Joueur {
    private int tacle;


    public Defenseur(String nom, int age, int taille, int poids, String poste, int endurance, int total, int tacle) {
        this.setNom(nom);
        this.setAge(age);
        this.setTaille(taille);
        this.setPoids(poids);
        this.setPoste(poste);
        this.setEndurance(endurance);
        this.tacle=tacle;
    }



    public int getTacle() {
        return tacle;
    }

    public void setTacle() {
        this.tacle = tacle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Defenseur defenseur = (Defenseur) o;
        return tacle == defenseur.tacle;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + tacle;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Defenseur{" +
                "tacle=" + tacle +
                '}';
    }
}
