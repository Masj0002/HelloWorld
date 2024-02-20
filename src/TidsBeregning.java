import java.util.Scanner;

public class TidsBeregning {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Hvor mange timer er der gået siden midnat?");
        int timer = input.nextInt();
        System.out.println("Der er gået " + timer + " timer");

        System.out.println("Hvor mange minutter er der gået?");
        int minutter = input.nextInt();
        System.out.println("Der er gået " + timer + " timer og " + minutter + " minutter");

        System.out.println("Hvor mange sekunder er der gået?");
        int sekunder = input.nextInt();
        System.out.println("Der er gået " + timer + " timer " + minutter + " minutter og " + sekunder + " sekunder");

        int sekunderSidenMidnat = 0;
        int sekunderPåEnDag = 86400;
        int sekunderTilMidnat = 0;


        sekunderSidenMidnat = ((minutter * 60) + (timer * 60 * 60) + (sekunder));
        sekunderTilMidnat = ((sekunderPåEnDag) - (sekunderSidenMidnat));

        System.out.println(timer+":"+minutter+":"+sekunder+" er klokken nu.");
        System.out.println("Siden midnat er der gået " + sekunderSidenMidnat + " sekunder.");
        System.out.println("Der er " + sekunderTilMidnat + " sekunder til midnat.");

    }
}
