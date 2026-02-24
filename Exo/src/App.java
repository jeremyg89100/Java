
public class App {
    public static void main(String[] args) throws Exception {
        // Exo 1
        // My Java Code Forever

        // Exo2

        /** My Java
         Code
         Forever */

        // Exo 3

        // int number = 1;
        // double pi = 3.14;
        // char lettre = 'A';
        // boolean vrai = true;
        // byte smallNumber = 23;
        // short shortNumber = 70;
        // long longNumber = 10000000;
        // String formattedLongNumber = String.format(Locale.US,"%,d", longNumber);

        // String allVar = "int :  {0}, double :  {1}, char :  {2}, boolean : {3}, byte : {4}, short : {5}, longNumber : {6}";
        // String allVarMessage = MessageFormat.format(allVar, number, pi, lettre, vrai, smallNumber, shortNumber, formattedLongNumber);
        // System.out.printf(allVarMessage);

        // Exo 4

        // String my42char = "quarante-deux";
        // int count42char = my42char.length();

        // System.out.println(count42char);

        // Exo 5

        // Integer maVariable = null;

        // int resultat = Optional.ofNullable(maVariable).orElse(42);
        // System.out.println(resultat);

        // Exo 6
       
        // String word = "quarante-deux";
        // char[] myArray42 = word.toCharArray();
        // System.out.println(myArray42);

        //Exo 7

        // int myArray42Len = myArray42.length;

        // System.out.println(myArray42Len);

        // Exo 8

        // String message42 = new String(myArray42);
        // System.out.println("La grande réponse sur la vie, l'univers et le reste ! "+message42);

        // Exo 9

        // Random randomNumbers = new Random();
        // Integer random = randomNumbers.nextInt(42)+1;
        // System.out.println(random == 42);

        // Exo 10

        // Integer my42Int = 42;
        // Double my42Double = 42.0;
        // String my42String = "quarante-deux";
        // Boolean my42Boolean = true;

        // String type = my42Double.getClass().getSimpleName();

        // System.out.println(type);

        // Exo 11
        // String compute42 = Integer.toString(7 * 6);
        // System.out.println(compute42);

        // Exo 12

        // String multiple42 = "42424242";
        // String qd = "42";
        // String qd2 = "quarante-deux";
        // String newString42 = multiple42.replace(qd, qd2);
        // System.out.println(newString42);

        // Exo 13

        int a = 24;
        int b = 42;
        int swap = a;
        a = b;
        b = swap;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }

}
