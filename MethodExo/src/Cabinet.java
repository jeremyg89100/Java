import java.util.ArrayList;

public class Cabinet {
    public Cabinet(){}
    private ArrayList<Patient> listePatients = new ArrayList<>();

    public void ajouterPatient(Patient p) {
        this.listePatients.add(p);
    }

    public void afficherPatient() {
        String [][] tableau = new String[listePatients.size()][5];
        System.out.println("             NOM   | AGE | TAILLE | POIDS|  IMC  ");
        for (int i = 0; i < listePatients.toArray().length; i++ ) {
            Patient p = listePatients.get(i);
            System.out.print("Patient " + (i+1) + " : ");
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    tableau[i][j] = String.valueOf(p.getNom());
                } if (j == 1) {
                    tableau[i][j] = String.valueOf(p.getAge());
                } if (j == 2) {
                    tableau[i][j] = String.valueOf(p.getTaille());
                } if (j == 3) {
                    tableau[i][j] = String.valueOf(p.getPoids());
                } if (j == 4) {
                    tableau[i][j] = String.valueOf(p.getImc());
                }
                System.out.print(tableau[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
