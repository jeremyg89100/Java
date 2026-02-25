public class Patient {
    private String nom;
    private int age;
    private double poids;
    private double taille;

    public Patient(String nom, int age, double poids, double taille) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
        this.taille = taille;
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public double getTaille() {
        return this.taille;
    }

    public double getPoids() {
        return this.poids;
    }

    public double getImc() {
        return this.poids / (this.taille * this.taille);
    }



    public String afficherInfosPatient() {
        return "Nom patient : " + this.nom + " / Age patient: " + this.age + " / Poids patient: " + this.poids + " / Taille patient: " + this.taille;
    }
}
