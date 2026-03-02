public class Vehicule {
    private String marque;
    private String imma;
    private String color;
    private String model;
    private int reservoir;

    public Vehicule(String marque, String imma, String color, String model, int reservoir) {
        this.marque = marque;
        this.imma = imma;
        this.color = color;
        this.model = model;
        this.reservoir = reservoir;
    }

    public void avancer() {
        System.out.println("J'avance");
    }

    public void reculer() {
        System.out.println("Je recule");
    }

    public void turnLeft() {
        System.out.println("Je tourne à gauche");
    }

    public void turnRight() {
        System.out.println("Je tourne à droite");
    }

    public void klaxonner() {
        System.out.println("Tut tut");
    }

    public void pleinEssence(int litre) {
        if (litre > this.reservoir) {
            System.out.println("Le réservoir déborde !");
        } else {
            System.out.println("Vous avez ajouté " + litre + "litres d'essence");
        }
    }

    public String infos () {
        return marque + " " + model + " " + imma + " " + color +  " " + reservoir;
    }
}
