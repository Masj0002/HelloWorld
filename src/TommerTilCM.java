import java.util.Scanner;

public class TommerTilCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange tommer skal omregnes til centimeter?");
        double tommer = input.nextDouble();

        //skriv med stort og underscore når du laver konstanter
        final double CENTIMETER_PER_TOMME = 2.54;

        double tommerTilCM = (tommer * CENTIMETER_PER_TOMME);
        System.out.println(tommer + " tommer svare til " + tommerTilCM + "cm");
    }
}
