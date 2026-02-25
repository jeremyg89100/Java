// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exo 1
        Livre l = new Livre("Lord of the ring");
        System.out.println("Exo 1: " + l.getTitre());
        l.setTitre("Lord of the Ring 2");
        System.out.println("Exo 1 titre changé: " + l.getTitre());

        // Exo 2
        Jeu j = new Jeu();
        System.out.println("Exo 2: " + j.name);

        //Exo 3

        Chien doj = new Chien("Rufus");
        System.out.println("Exo 3: " + doj.name);

        // Exo 4

        Compte c = new Compte();
        Compte co = new Compte();
        System.out.println("Exo 4: " + Compte.nombreDeComptes);

        // Exo 5

        Voiture vroom = new Voiture("Citroen", "EJ-780-NX", "Black", "C3", 4, 4, 45 );
        System.out.println("Exo 5: " + vroom.infos());
        vroom.klaxonner();

        Camion camtard = new Camion("Peterbilt", "EM-120-LX","Red","JsaisPas",6,2, 100);
        System.out.print("Exo 5 Camion: " + camtard.infos());
        camtard.klaxonner();

        Moto moto = new Moto ("Yamaha", "JS-823-LS", "Blue", "JenSaisRien", 2, 50);
        System.out.print("Exo 5 Moto: " + moto.infos());
        moto.klaxonner();
        moto.pleinEssence(70);
    }
}