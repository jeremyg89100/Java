public class Reptile extends Animal {
    public Reptile(String nom) {
        super(nom);
    }

    public void ramper() {
        System.out.println("Le " + nom + " rampe");
    }
    public void seDeplacer() {
        ramper();
    }
}
