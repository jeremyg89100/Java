public class Ariane6 extends Rocket{
    public Ariane6(String name, double weight) {
        super(name, weight);
    }

    public String displayData() {
        return "Fusée " + name + " créee, Poids : " + weight;
    }
    public String launching() {
        return super.launch() + "Les étages de la fusée " + name + " se séparent après le lancement.";
    }
}
