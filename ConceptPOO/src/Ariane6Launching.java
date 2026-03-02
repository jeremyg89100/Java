public class Ariane6Launching extends Ariane6 {
    public Ariane6Launching(String nom, double poids) {
        super(nom, poids);
    }

    public String launchRocket() {
        return super.displayData() + " " + super.launching();
    }

    public static void main(String[] args) {
        //Exo 6
        System.out.println("Exo 6");
        Ariane6Launching ariane6 = new Ariane6Launching("Ariane 6", 500000.0);
        System.out.println(ariane6.launchRocket());
    }
}


