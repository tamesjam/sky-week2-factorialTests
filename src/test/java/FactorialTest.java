import com.sky.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void factorial_5() {
        Assertions.assertEquals(5, Main.factorial(120));
    }

    @Test
    public void factorial_10() {
        Assertions.assertEquals(10, Main.factorial(3628800));
    }

    @Test
    public void factorial_12_failed() {
        Assertions.assertEquals(1500, Main.factorial(479001600));
    }
}
