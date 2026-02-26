public class Rocket {
    public String name;
    public double weight;
    public Rocket(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String launch() {
        return "\nLa fusée " + this.name + " est en phase de lancement. \n" +
                "La fusée " + this.name + " commence son lancement avec une poussée spécifique.\n";
    }
}
