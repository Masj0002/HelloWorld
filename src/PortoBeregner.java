import java.util.Scanner;

public class PortoBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange gram vejer dit brev?");
        int vægtAfBrevIGram = input.nextInt();
        System.out.println("Dit brev vejer " + vægtAfBrevIGram + "g");
        int Pris;

//Fejl håndtering øverst (i dette tilfælde alt under 0 og over 2000.
        if (vægtAfBrevIGram <= 0 || vægtAfBrevIGram > 2000) {
            System.out.println("Dette brev kan ikke købes");
        } else {
            if (vægtAfBrevIGram < 250) {
                Pris = 25;

            } else if (vægtAfBrevIGram < 500) {
                Pris = 50;

            } else {
                Pris = 75;
            }
            System.out.println("Dit brev koster " + Pris + "kr.");

        }

    }
}

