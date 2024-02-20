import java.util.Random;

public class TerningeKast {
    public static void main(String[] args) {
        Random rand = new Random();
        //int numberToHit = 7;
        //int terning1 = rand.nextInt(6)+1;
        //int terning2 = rand.nextInt(6)+1;
       // boolean numberHit = true;
        int sum = 0;
        int forsg = 0;


        while (!(sum == 7)) {
            int terning1 = rand.nextInt(6) + 1;
            int terning2 = rand.nextInt(6) + 1;
            sum = terning2 + terning1;
            System.out.println(terning1 + " + " + terning2 + " = " + sum);
            forsg++;
        }
        System.out.println("Der blev brugt " + forsg + " forsøg");

    }
}
