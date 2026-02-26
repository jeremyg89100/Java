import javax.sound.sampled.Port;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Reptile serpent = new Reptile("serpent");
        Mammifere chat = new Mammifere("chat");
        Oiseau pigeon = new Oiseau("pigeon");
        serpent.seDeplacer();
        chat.seDeplacer();
        pigeon.seDeplacer();

        // Exo 2
        System.out.println("Exo 2");
        ArrayList<Plat> tabPlat = new ArrayList<Plat>();
        PlatPrincipal pate = new PlatPrincipal("Pate", 18, "grande");
        Dessert tarte = new Dessert("Tarte au citron", 8, "peu");
        MenuSpecial special = new MenuSpecial("Menu du chef", 25);
        tabPlat.add(pate);
        tabPlat.add(tarte);
        tabPlat.add(special);
        System.out.println(tabPlat.get(0).afficherPlat());
        System.out.println(tabPlat.get(1).afficherPlat());
        System.out.println(tabPlat.get(2).afficherPlat());

        // Exo 3
        System.out.println("Exo 3");
        Director director = new Director("Jean");
        Teacher teacher = new Teacher("Edgar");
        AdministrativeStaff administrativeStaff = new AdministrativeStaff("Jean-Edgar");

        System.out.println(director.working());
        System.out.println(teacher.working());
        System.out.println(administrativeStaff.working());

        // Exo 4
        System.out.println("Exo 4");
        Circle circle = new Circle(8);
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());

        //Exo 5
        System.out.println("Exo 5");
        FighterJet rafale = new FighterJet("Rafale");
        TransportPlane a300 = new TransportPlane("A300");
        AircraftCarrier charlesDeGaulle = new AircraftCarrier("Charles de Gaulle");
        charlesDeGaulle.addAircraft(rafale);
        charlesDeGaulle.addAircraft(a300);
        System.out.println(charlesDeGaulle.launchAircraft(0));
        System.out.println(charlesDeGaulle.launchAircraft(1));
        System.out.println(Arrays.toString(charlesDeGaulle.getAircraftNames()));
    }
}