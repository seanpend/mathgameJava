////public class QuestionTest2 {
//    private int value1;
//    private int value2;
//    private int value3;
//    public String operator;
//    // a score counter to hold the students score
//    //public int count = 0;
//    public int score = 0;
//
//    // to do: make the game ask multiple questions
//    // have a tally and message at the end to display the tally
//
//    public QuestionTest2(int v1, int v2, String op) {
//        value1 = v1;
//        value2 = v2;
//        value3 = value1 * value2;
//        operator = op;
//    }
//
//    public void showQuestion2() {
//        if (operator == "+" || operator == "-" || operator == "*") {
//            System.out.printf("What is %d " + operator + " %d?\n", value1, value2);
//        } else if (operator == "/") {
//            System.out.printf("What is %d " + operator + " %d?\n", value3, value2);
//        }
//    }
//
//    public boolean checkAnswer2(int response) {
//        int correct = 0;
////        int count = 0;
////        int score = 0;
//        if (operator == "+") {
//            correct = value1 + value2;
//        } else if (operator == "-") {
//            correct = value1 - value2;
//        } else if (operator == "*") {
//            correct = value1 * value2;
//        } else if (operator == "/") {
//            correct = value3 / value2;
//        }
//
//        if (response == correct) {
//            System.out.println(response + " is correct!");
////            count++;
//            score++;
//        } else {
//            System.out.println(response + " is wrong :(");
////            count++;
//        }
////        {
////        if (count >= 9 && score >= 9) {
////            System.out.println("Well done on your score of " + score + " out of " + count + "!");
////        } else if(count >= 9 && score < 9) {
////            System.out.println("Good try with a score of " + score + " out of " + count);
////        }
////        }
//        return false;
//    }
////    public void showScore() {
////        if(count == 10 && score >= 9) {
////            System.out.println("Well done on your score of " + score + " out of " + count + "!");
////        } else if(count == 10 && score < 9) {
////            System.out.println("Good try with a score of " + score + " out of " + count);
////        }
////    }
//}
