package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int POINTS_TO_WIN = 3;
    public static final int DATA_QUESTION = 0;
    public static final int DATA_ANSWER = 1;


    public static void launch(String[][] dataGame, String gameDescription) {
        int count = 0;
        String playerAnswer;
        Scanner in = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        String playerName = in.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameDescription);
        while (count < Engine.POINTS_TO_WIN) {
            System.out.println("Question: " + dataGame[count][DATA_QUESTION]);
            System.out.print("Your answer: ");
            playerAnswer = in.nextLine();
            if (playerAnswer.equals(dataGame[count][DATA_ANSWER])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was '"
                        + dataGame[count][DATA_ANSWER] + "'. \nLet's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
