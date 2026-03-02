public class Personne {
    private String nom;
    private String prenom;
    private Integer age;

    public Personne(String nom, String prenom, Integer age) {
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public Integer getAge() {
        return this.age;
    }
}
