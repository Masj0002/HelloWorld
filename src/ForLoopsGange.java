public class ForLoopsGange {
    public static void main(String[] args) {

        /*for (int i = 1; i<=4; i++){
           int frsteTal =2;
           int gangetMed = i;

           int sidsteTal = (frsteTal*gangetMed);
            System.out.println(frsteTal+" gange "+i+" = "+sidsteTal);
        }*/
        /*for (int i = 1; i <5; i++){
            int sum=(2*i);
            System.out.println("2 gange "+i+" = "+sum);
        }*/

        for (int i = 1; i < 7; i++) {
            int sum = (2 * i);
            System.out.print(" " + sum);
        }
        System.out.println();
        for (int i = 4; i <= 79; i += 15) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 30; i >= -20; i -= 10) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = -7; i <= 13; i += 4) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 97; i >= 82; i -= 3) {
            System.out.print(" " + i);
        }
    }
}
