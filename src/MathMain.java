import java.util.Random;
import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {

        Random rand = new Random();
        int x,y,z;
        int count = 0;
        int score = 0;
        String convertOp = "";

        for(int i = 0; i <= 9; i++) {
        x = rand.nextInt(12) + 1;
        y = rand.nextInt(12) + 1;
        z = rand.nextInt(4) + 1;
        //QuestionTest2 q = new QuestionTest2(x, y, convertOp);
        //q.showScore();
        if(z == 1) {
            convertOp = "+";
            count++;
        } else if (z == 2) {
            convertOp = "-";
            count++;
        } else if (z == 3) {
            convertOp = "*";
            count++;
        } else if (z == 4) {
            convertOp = "/";
            count++;
        }


        Scanner in = new Scanner(System.in);
        QuestionTest2 q = new QuestionTest2(x, y, convertOp);
        q.showQuestion2();
        int response = in.nextInt();
        q.checkAnswer2(response);
    q.showScore();
    score = q.showScore();
    if(count == 10) {
        System.out.println("Well done on your score of: " + score + " out of " + count);
    }


    }

} }
