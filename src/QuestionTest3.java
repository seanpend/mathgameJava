
public class QuestionTest3 {
    private int value1;
    private int value2;
    private int value3;
    public String operator;

    // to do: make the game ask multiple questions
    // have a tally and message at the end to display the tally
    public QuestionTest3(int v1, int v2, String op) {
        value1 = v1;
        value2 = v2;
        value3 = value1 * value2;
        operator = op;
    }

    public void showQuestion3() {
        if (operator == "+" || operator == "-" || operator == "*") {
            System.out.printf("What is %d " + operator + " %d?\n", value1, value2);
        } else if (operator == "/") {
            System.out.printf("What is %d " + operator + " %d?\n", value3, value2);
        }
    }

    public boolean checkAnswer3(int response) {
        int correct = 0;

        if (operator == "+") {
            correct = value1 + value2;
        } else if (operator == "-") {
            correct = value1 - value2;
        } else if (operator == "*") {
            correct = value1 * value2;
        } else if (operator == "/") {
            correct = value3 / value2;
        }

        if (response == correct) {
            System.out.println(response + " is correct!");
            return true;
        } else {
            System.out.println(response + " is wrong :(");
            return false;
        }
    }
}