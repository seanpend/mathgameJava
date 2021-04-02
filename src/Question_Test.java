import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class Question_Test {
    @Test
    void testCreate() {
        QuestionTest3 q = new QuestionTest3(3, 4, "+");
        assertFalse(q.checkAnswer3(0));
        assertTrue(q.checkAnswer3(7));
    }
    @Test
    void testCreate1() {
        QuestionTest3 q1 = new QuestionTest3(2, 2, "*");
        assertFalse(q1.checkAnswer3(1));
        assertTrue(q1.checkAnswer3(4));
    }
    @Test
    void testCreate2() {
        QuestionTest3 q2 = new QuestionTest3(4, 2, "/");
        assertFalse(q2.checkAnswer3(1));
        assertTrue(q2.checkAnswer3(4));
    }
    @Test
    void testCreate3() {
        QuestionTest3 q3 = new QuestionTest3(10, 5, "-");
        assertFalse(q3.checkAnswer3(2));
        assertTrue(q3.checkAnswer3(5));
    }
//    public QuestionTest3 q;

//    @BeforeEach
//    public void out() {
//        q.showQuestion3();
//        System.setOut(new PrintStream(outContent));
//    }
//
//    @AfterEach
//    public void restore() {
//        System.setOut(originalOut);
//        System.setErr(originalErr);
//    }
}
