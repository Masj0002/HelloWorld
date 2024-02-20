import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        /*
        //Uden Scanner
        double Højde = 1.92;
        double Vægt = 87;
        double Bmiregner = Vægt /(Højde*Højde);
        System.out.println(Bmiregner+" er din BMI");
        */

        //Med Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("For at finde din BMI skal du først skrive din Højde i meter");
        double højde = input.nextDouble();
        System.out.println("Du er " + højde + "M " + ". Dernest skriv din vægt");
        double vægt = input.nextDouble();
        double bMIRegner = (vægt / (højde * højde));
        System.out.println("Du er " + højde + "M " + "og du vejer " + vægt + "kg");
        System.out.println("Din BMI er på " + bMIRegner + ".");

// Chain command
        if (bMIRegner < 18.5) {
            System.out.println("Du er Undervægtig");
        } else if (bMIRegner < 25) {
            System.out.println("Du er Normalvægtig");
        } else if (bMIRegner < 30) {
            System.out.println("Du er Overvægtig");
        } else System.out.println("Du er Svært Overvægtig");

    }
}