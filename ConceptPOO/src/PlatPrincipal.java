public class PlatPrincipal extends Plat {
    private String[] portion = {"petite", "moyenne", "grande"};
    private String portionChoisie;

    public PlatPrincipal(String nom, double prix, String portionChoisie) {
        super(nom, prix);
        this.portionChoisie = portionChoisie;
    }

    public String[] getPortion() {
        return portion;
    }

    public double calculerPrixFinal() {
        double prixCalcule = this.prix;
        if (this.portionChoisie.equals(this.portion[1])) {
            prixCalcule += 2;
        }
        if (this.portionChoisie.equals(this.portion[2])) {
            prixCalcule +=4;
        }
        return prixCalcule + (prixCalcule * tva);
    }
}
