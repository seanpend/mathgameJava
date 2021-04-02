import java.util.Random;
import java.util.Scanner;
/**
 * This is a simple math game for grades 3-5.
 *
 * @author Sean Sullivan
 */
public class Tutorial {
    public static void main(String[] args) {
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
        // An if statement to display the students total score at the end of the game
        if(count >= 9) {
            System.out.println("Well done on your score of " + count + "!");
        } else {
            System.out.println("Good try with a score of " + count);
        }
    }
}


// Workshop 2 Class Example
/*
public class Car {
    private int rego
    public Car(int defaultRego){
    this.rego = defaultRego;
}

}

// how do we use class

Car myCar = new Car(123)

Car myCar =  new Car();

/////////
public class Car {
    private int rego
    public void assignRego(int defaultRego){
    this.rego = defaultRego;
}

}

// how do we use class

Car myCar = new Car(123)

Car myCar =  new Car();
myCar.assignRego(123456);


 */







// Github class assignment file
//
//package au.edu.usc.mathgame;
//
//        import java.util.Random;
//        import java.util.Scanner;
//
///**
// * A simple console-based maths quiz for primary school children.
// *
// * @author Author1
// * @author Author2
// */
//public class Main {
//
//    public static void main(String[] args) {
//        Random rand = new Random();
//        Scanner input = new Scanner(System.in);
//
//        // now ask some random addition questions.
//        for (int i = 0; i < 10; i++) {
//            int a = rand.nextInt(20);
//            int b = rand.nextInt(20);
//            int correct = a + b;
//            System.out.printf("What is %2d + %2d? ", a, b);
//            int response = input.nextInt();
//            if (response == correct) {
//                System.out.printf("  Yes!\n");
//            } else {
//                System.out.printf("  No, the answer is %d.\n", correct);
//            }
//        }
//    }
//}

