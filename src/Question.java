import java.util.Random;
import java.util.Scanner;

public class Question {
    private int value1;
    private int value2;

    public void showQuestion() {
        Random rand = new Random(); // Creates a random object
        int x,y;
        // a score counter to hold the students score
        int count = 0;

        // For loop to generate random questions for the student
        for(int i = 0; i <= 9; i++) {
            // Assign numbers to x and y variables
            x = rand.nextInt(12) + 1;
            y = rand.nextInt(12) + 1;
            System.out.printf("What is " + x + " + " + y + "?");
            Scanner in = new Scanner(System.in);
            // Scanner to record students response to a question
            int response = in.nextInt();
            // Variable to hold correct answer
            int correct = x + y;
            // If statement to check whether students response is equal to the correct answer
            if(response == correct){
                System.out.println(response + " is correct!");
                count++;
            } else {
                System.out.println(response + " is wrong :(");
            }
    }
}}
