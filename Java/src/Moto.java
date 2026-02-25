public class Moto extends Vehicule {
    private int nbrRoue;
    public Moto(String marque, String imma, String color, String model,int nbrRoue, int reservoir) {
        super(marque, imma, color, model, reservoir);
        this.nbrRoue = nbrRoue;
    }

    @Override
    public String infos() {
        return super.infos() + " Nombre Roues : " + nbrRoue;
    }

    public void klaxonner() {
        System.out.println("\nMip mip");
    }
}
