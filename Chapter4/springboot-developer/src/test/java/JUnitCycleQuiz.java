import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

    @BeforeEach
    public void hello() {
        System.out.println("Hello!");
    }

    @AfterAll
    static void bye() {
        System.out.println("Bye!");
    }

    @Test
    public void juintQuiz3() {
        System.out.println("This is first test");
    }

    @Test
    public void juintQuiz4() {
        System.out.println("This is second test");
    }
}
