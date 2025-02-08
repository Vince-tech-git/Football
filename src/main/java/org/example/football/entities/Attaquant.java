package org.example.football.entities;

public class Attaquant extends Joueur{

    private int tir;

    public Attaquant(String nom, int age, int taille, int poids, String poste, int endurance, int total, int tir) {
        this.setNom(nom);
        this.setAge(age);
        this.setTaille(taille);
        this.setPoids(poids);
        this.setPoste(poste);
        this.setEndurance(endurance);
        this.setTotal(total);
        this.tir=tir;
    }


    public int getTir() {
        return tir;
    }

    public void setTir(int tir) {
        this.tir = tir;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Attaquant attaquant = (Attaquant) o;
        return tir == attaquant.tir;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + tir;
        return result;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Attaquant{" +
                "tir=" + tir +
                '}';
    }
}
