package org.example.football.entities;

public class Gardiens extends Joueur{
    private int reflexe ;

    public Gardiens(String nom, int age, int taille, int poids, String poste, int endurance, int total, int reflexe) {
        this.setNom(nom);
        this.setAge(age);
        this.setTaille(taille);
        this.setPoids(poids);
        this.setPoste(poste);
        this.setEndurance(endurance);
        this.setTotal(total);
        this.setReflexe(reflexe);
//        super(nom, age, taille, poids, poste, endurance, total);
//        this.reflexe = reflexe;
    }


    public int getReflexe() {
        return reflexe;
    }
    public void setReflexe(int reflexe) {

        this.reflexe = reflexe;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Gardiens gardiens = (Gardiens) o;
        return reflexe == gardiens.reflexe;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + reflexe;
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Gardiens{" +
                "reflexe=" + reflexe +
                '}';
    }
}
