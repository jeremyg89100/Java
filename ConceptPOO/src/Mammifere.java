public class Mammifere extends Animal {
    public Mammifere(String nom) {
        super(nom);
    }

    public void courir() {
        System.out.println("Le " + nom + " court");
    }
    public void seDeplacer() {
        courir();
    }
}
