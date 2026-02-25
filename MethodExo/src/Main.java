//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exo 1
        Surface surface = new Surface();
        System.out.println("Exo 1: " + surface.calculerM2(7, 3));

        //Exo 2
        Personne test = new Personne("Test", 23, "Blairiaux les 3 fontaines");
        test.afficherNom();
        test.afficherAge();
        test.afficherAdresse();

        // Exo 3
//        Calculatrice calc = new Calculatrice();
//        System.out.println(calc.add(1, 3));
//        System.out.println(calc.add(1.5, 3.3));
//        System.out.println(calc.effectuerOperations("", 0, 0));

        // Exo 4:
        Cabinet cabinet = new Cabinet();
        Patient patient1 = new Patient("Jeremy", 27, 64.5, 1.69);
        Patient patient2 = new Patient("Matthieu", 25, 68.5, 1.55);
        Patient patient3 = new Patient("Raymond", 76, 110.6, 1.63);
        cabinet.ajouterPatient(patient1);
        cabinet.ajouterPatient(patient2);
        cabinet.ajouterPatient(patient3);
        cabinet.afficherPatient();
    }
}