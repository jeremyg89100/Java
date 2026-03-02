import java.util.Scanner;

public class Calculatrice {

    public Calculatrice() {
    }
    public double add(double a ,double b) {
        return a + b;
    }

    public double sous(double a, double b) {
        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public int add(int a ,int b) {
        return a + b;
    }

    public int sous(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public double effectuerOperations(String operation, double a, double b) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le premier nombre : ");
        a = scan.nextDouble();
        System.out.println("Entrez le second nombre : ");
        b = scan.nextDouble();
        System.out.println("Entrez l'opération (+ , -, * ou /");
        operation = scan.next();

        switch (operation) {
            case "+" :
                return this.add(a, b);
            case "-" :
                return this.sous(a, b);
            case "*" :
                if ( a == 7 && b == 6) {
                    System.out.println("Easter egg le chiffre magique : ");
                    return this.multi(a, b);
                }
                else {
                    return this.multi(a, b);
                }
            case "/" :
                if (b == 0) {
                    System.out.println("Division par 0 impossible !");
                    return 0;
                }
                else {
                    return this.div(a, b);
                }
            default:
                System.out.println("Opération inconnue !");
                return 0;
        }
    }
}
