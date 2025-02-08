package org.example.football.entities;

public class Milieux extends Joueur{
    private int passe ;
    public Milieux (String nom, int age, int taille, int poids, String poste, int endurance, int total, int passe) {
        this.setNom(nom);
        this.setAge(age);
        this.setTaille(taille);
        this.setPoids(poids);
        this.setPoste(poste);
        this.setEndurance(endurance);
        this.setTotal(total);
        this.passe=passe;

    }

    public int getPasse() {
        return passe;
    }

    public void setPasse(int passe) {
        this.passe = passe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Milieux milieux = (Milieux) o;
        return passe == milieux.passe;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passe;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Milieux{" +
                "passe=" + passe +
                '}';
    }
}
