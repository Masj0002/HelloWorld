public class Tid {
    public static void main(String[] args) {
        int sekund = 5;
        int minut = 40;
        int time = 11;

        int sekunderSidenMidnat = 0;
        int sekunderPåEnDag = 86400;
        int sekunderTilMidnat = 0;


        sekunderSidenMidnat = ((minut * 60) + (time * 60 * 60) + (sekund));
        sekunderTilMidnat = ((sekunderPåEnDag) - (sekunderSidenMidnat));

        System.out.println(time + "t " + minut + "m " + sekund + "s");

        System.out.println("Siden midnat er der gået " + sekunderSidenMidnat + " sekunder");
        System.out.println(sekunderTilMidnat + " sekunder er der til midnat");

    }
}
