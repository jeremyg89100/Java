public class Personne {
    public String name;
    protected int age;
    protected String adresse;
    public Personne (String name, int age, String adresse) {
        this.name = name;
        this.age = age;
        this.adresse = adresse;
    }

    public void afficherNom() {
        System.out.println("Exo 2 nom: " + this.name);
    }

    private String changerNom(String name) {
        return this.name = name;
    }

    protected void afficherAge() {
        System.out.println("Exo 2 Age : " + this.age);
    }

    void afficherAdresse() {
        System.out.println("Exo 2 Adresse: " + this.adresse);
    }

    public static void main(String[] args) {
        Personne test = new Personne("Test", 23, "Une adresse");
        System.out.println("Exo 2 rename: " + test.changerNom("TestRename"));
    }
}
