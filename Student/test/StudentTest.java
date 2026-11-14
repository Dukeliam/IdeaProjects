import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testTesttheScoreIsAbove50(){
        Student score = new Student("Williams", 21, 75);

        Assertions.assertTrue(score.hasPassed());

    }
}
