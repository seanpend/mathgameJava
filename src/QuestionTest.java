

public class QuestionTest {
    private int value1;
    private int value2;
    private int value3;
    public String operator;
    // a score counter to hold the students score
    int count = 0;

    // to do: make the game ask multiple questions
    // have a tally and message at the end to display the tally

    public QuestionTest(int v1, int v2, String op) {
        value1 = v1;
        value2 = v2;
        value3 = value1 * value2;
        operator = op;
    }

    public void showQuestion() {
        if(operator == "+" || operator == "-" || operator == "*") {
            System.out.printf("What is %d " + operator + " %d?\n", value1, value2);
        } else if(operator == "/") {
            System.out.printf("What is %d " + operator + " %d?\n", value3, value2);
        }
    }

    public boolean checkAnswer(int response) {
        int correct = 0;
        if(operator == "+") {
            correct = value1 + value2;
        } else if(operator == "-") {
            correct = value1 - value2;
        } else if(operator == "*") {
            correct = value1 * value2;
        } else if (operator == "/") {
            correct = value3 / value2;
        }

        if(response == correct){
            System.out.println(response + " is correct!");
            //count++;
        } else {
            System.out.println(response + " is wrong :(");
        }

        return false;
    }
}