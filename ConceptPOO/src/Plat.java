public abstract class Plat {
    public String nom;
    public double prix;
    public static final double tva = 0.2;

    public Plat(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public abstract double calculerPrixFinal();

    public String afficherPlat() {
        return nom + " Prix : " + prix + " euros" + " Prix TTC et après réduction : " + calculerPrixFinal();
    }
}
