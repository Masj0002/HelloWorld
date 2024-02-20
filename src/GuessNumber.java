import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10) + 1;
        int guessCount = 0;
        boolean numberGuessed = true;
        int userGuess;

        while (numberGuessed) {
            guessCount++;
            System.out.println("Indtast et tal mellem 1 og 10");
            userGuess = scanner.nextInt();
            if (numberToGuess == userGuess) {
              numberGuessed = false;
            } else if (numberToGuess < userGuess) {
                System.out.println("Desværre mit nummer er mindre end " + userGuess);
            } else {
                System.out.println("Du gættet forkert, mit nummer er større end " + userGuess);
            }
        }
        System.out.println("Du gættet rigtigt! Det tal jeg tænkte på var " + numberToGuess);
        System.out.println("Du brugte " + guessCount + " forsøg");
    }
}
