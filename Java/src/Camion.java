public class Camion extends Vehicule {
    private int nbrRoue;
    private int nbrPortes;
    public Camion(String marque, String imma, String color, String model,int nbrRoue,int nbrPortes, int reservoir) {
        super(marque, imma, color, model, reservoir);
        this.nbrRoue = nbrRoue;
        this.nbrPortes = nbrPortes;
    }

    @Override
    public String infos() {
        return super.infos() + " Nombre Roues : " + nbrRoue + " Nombre de portes : " + nbrPortes;
    }

    public void klaxonner() {
        System.out.println("\nOuimp Ouimp");
    }
}
