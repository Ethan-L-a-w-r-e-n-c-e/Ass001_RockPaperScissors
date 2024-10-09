import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char playerOne;
        char playerTwo;
        char carryOnWith;
        boolean carryOnWithValid;
        boolean goAgain = false;
        boolean playerOneValid;
        boolean playerTwoValid;

        do {
            do {
                System.out.println("Player One enter R(ock), P(aper), or S(cissors)");
                playerOne = scan.next().toLowerCase().charAt(0);
                playerOneValid = playerOne == 'r' || playerOne == 'p' || playerOne == 's';


            } while (!playerOneValid);
            do {
                System.out.println("Player Two enter R(ock), P(aper), or S(cissors)");
                playerTwo = scan.next().toLowerCase().charAt(0);
                playerTwoValid = playerTwo == 'r' || playerTwo == 'p' || playerTwo == 's';

            } while (!playerTwoValid);
            if (playerOne == 'r' && playerTwo == 'r') {
                System.out.println("Rock does not beat Rock it is a Tie");
            } else if (playerOne == 'r' && playerTwo == 'p') {
                System.out.println("Rock loses Paper Player Two Wins");
            } else if (playerOne == 'r') {
                System.out.println("Rock beats Scissors Player One Wins");
            } else if (playerOne == 's' && playerTwo == 'p') {
                System.out.println("Scissors Loses to Rock Player Two Wins");
            } else if (playerOne == 's' && playerTwo == 's') {
                System.out.println("Scissors does not beat Scissors it is a Tie");
            } else if (playerOne == 's'){
                System.out.println("Scissors loses to Rock Player Two Wins");
            } else if (playerTwo == 'r'){
                System.out.println("Paper beats Rock Player One Wins");
            } else if (playerTwo == 's'){
                System.out.println("Paper loses to Scissors Player Two Wins");
            } else {
                System.out.println("Paper does not beat Paper it is a Tie");
            }

            do {
                System.out.println("Do you want to play again Y/N");
                carryOnWith = scan.next().toLowerCase().charAt(0);
                if(carryOnWith == 'y'){
                    goAgain = true;
                    carryOnWithValid = true;
                } else if (carryOnWith == 'n'){
                    goAgain = false;
                    carryOnWithValid = true;
                } else {
                    carryOnWithValid = false;
                    System.out.println("You have entered the wrong thing in");
                }
            } while(!carryOnWithValid);

        } while (goAgain);

    }
}