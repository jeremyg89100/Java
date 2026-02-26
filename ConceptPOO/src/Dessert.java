public class Dessert extends Plat {
    private String[] sucreAjoute = {"peu", "moyen", "beaucoup"};
    private String sucre;

    public Dessert(String nom, double prix, String sucre) {
        super(nom, prix);
        this.sucre = sucre;
    }

    public String[] getSucreAjoute() {
        return sucreAjoute;
    }

    public double calculerPrixFinal() {
        double prixCalcule = this.prix;
        if (this.sucre.equals(this.sucreAjoute[1])) {
            prixCalcule += 2;
        }
        if (this.sucre.equals(this.sucreAjoute[2])) {
            prixCalcule +=4;
        }
        else prixCalcule += 0;
        return prixCalcule + (prixCalcule * tva);
    }
}
