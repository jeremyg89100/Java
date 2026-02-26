public class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    public void voler() {
        System.out.println("Le " + nom + " vole");
    }
    public void seDeplacer() {
        voler();
    }
}

