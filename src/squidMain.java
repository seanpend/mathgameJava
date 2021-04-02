
import java.util.Random;
import java.util.Scanner;

public class squidMain {
    //private highScore highScore;
    public static void main(String[] args) {
//        var numberOfQuestions = 10;
//        var correctCount = 0;
        squidMain main = new squidMain();
        main.playMultipleGames();
        //main.highScore = new highScore();

    }
    public static void playMultipleGames() {
        for(int i = 0; i <= 5; i++) {
            //private int highScore = highScore.
            playGame();
            //System.out.println("The current high score is " + highScore);
        }
    }
    public static void playGame() {
        Random rand = new Random();
        int x,y,z;
        String convertOp = "";

        var numberOfQuestions = 10;
        var correctCount = 0;

        for(int i = 0; i < numberOfQuestions; i++) {
            x = rand.nextInt(12) + 1;
            y = rand.nextInt(12) + 1;
            z = rand.nextInt(4) + 1;

            if(z == 1) {
                convertOp = "+";
            } else if (z == 2) {
                convertOp = "-";
            } else if (z == 3) {
                convertOp = "*";
            } else if (z == 4) {
                convertOp = "/";
            }

            QuestionTest3 q = new QuestionTest3(x, y, convertOp);
            Scanner in = new Scanner(System.in);

            q.showQuestion3();
            int response = in.nextInt();

            if(q.checkAnswer3(response))
            {
                correctCount++;
            }
        }
        int highScore = 0;
        if(correctCount == 10) {
            System.out.println("Well done on your perfect score of: " + correctCount + " out of " + numberOfQuestions);
            if(correctCount > highScore) {
                highScore = correctCount;
            }
            System.out.println("The high score is " + highScore);
        }
        else
        {
            System.out.println("Well done on your score of: " + correctCount + " out of " + numberOfQuestions);
            if(correctCount > highScore) {
                highScore = correctCount;
            }
            System.out.println("The high score is " + highScore);
        }

    }
}
