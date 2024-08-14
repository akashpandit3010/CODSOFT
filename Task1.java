import java.util.*;

public class Task1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int newgame = 1;
        while (newgame != 0) {
            int randomNumber;
            Random ran = new Random();
            randomNumber = ran.nextInt(100) + 1;
            int stop = 0;
            int playagain = 1;

            System.out.println("Hi! Lets play number guessing game!");

            while (playagain != 0) {

                System.out.println("You have five rounds: ");
                int round = 1;
                while (round != 6) {

                    System.out.println("Round " + round);
                    System.out.println("Guess any number between 1 to 100");
                    int no = sc.nextInt();
                    //System.out.println(randomNumber);

                    if (no > randomNumber) {
                        System.out.println("The number you have guessed is greater!");

                    }
                    if (no < randomNumber) {
                        System.out.println("The number you have guessed is smaller!");
                    }
                    if (no == randomNumber) {
                        System.out.println("Congratulations! You have guessed correct number.");
                        stop = 1;
                        playagain = 0;
                        break;
                    }
                    round++;
                }
                if (stop != 1) {
                    System.out.println("Sorry! You are done with 5 rounds!");
                    System.out.println("Do you want to play again? 0/1");
                    playagain = sc.nextInt();
                }

            }
            System.out.println("Do you want to start a new game? 0/1");
            newgame=sc.nextInt();
        }
        sc.close();
    }
}