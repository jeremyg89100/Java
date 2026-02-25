public class Voiture extends Vehicule {
    private int nbrRoue;
    private int nbrPortes;
    public Voiture(String marque, String imma, String color, String model,int nbrRoue,int nbrPortes, int reservoir) {
        super(marque, imma, color, model, reservoir);
        this.nbrRoue = nbrRoue;
        this.nbrPortes = nbrPortes;
    }

    @Override
    public String infos() {
        return super.infos() + " Nombre Roues : " + nbrRoue + " Nombre de portes : " + nbrPortes;
    }
}
