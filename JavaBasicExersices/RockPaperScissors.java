import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int computerPick = rand.nextInt(3);
        System.out.println(computerPick);

        System.out.println("Choose Rock (0), Paper (1), Scissors (2): ");
        int playerPick = input.nextInt();

        if(playerPick == 0) {
            System.out.println("You picked Rock !");
        } else if (playerPick == 1) {
            System.out.println("You picked Paper !");
        } else if (playerPick == 2) {
            System.out.println("You picked Scissors !");
        } else  {
            System.out.println("Pick a number between 0 and 2! Restart!");
        }

        if(computerPick == 0 & playerPick == 0) {
            System.out.println("Rock vs Rock !");
            System.out.println("Draw !");
        } else if (computerPick == 0 & playerPick == 1) {
            System.out.println("Rock vs Paper !");
            System.out.println("You Won !");
        } else if (computerPick == 0 & playerPick == 2) {
            System.out.println("Rock vs Scissors !");
            System.out.println("You Lost !");
        } else if (computerPick == 1 & playerPick == 0) {
            System.out.println("Paper vs Rock !");
            System.out.println("You Lost !");
        } else if (computerPick ==1 & playerPick == 1) {
            System.out.println("Paper vs Paper !");
            System.out.println("Draw !");
        } else if (computerPick ==1 & playerPick == 2) {
            System.out.println("Paper vs Scissors !");
            System.out.println("You Won !");
        } else if (computerPick ==2 & playerPick == 0) {
            System.out.println("Scissors vs Rock !");
            System.out.println("You Won !");
        } else if (computerPick ==2 & playerPick == 1) {
            System.out.println("Scissors vs Paper !");
            System.out.println("You Lost !");
        } else if (computerPick ==2 & playerPick == 2) {
            System.out.println("Scissors vs Scissors !");
            System.out.println("Draw !");
        }

    }
}
