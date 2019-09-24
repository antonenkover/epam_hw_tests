import org.junit.Test;
import static org.junit.Assert.*;

public class Task2Test {

    private Task2 instance;

    @Test
    public void shouldReturnOppositeNegativeValue() {
        assertEquals(instance.returnReverseNum(2), -2);
    }

    @Test
    public void shouldReturnOppositePositiveValue() {
        assertEquals(instance.returnReverseNum(-2), 2);
    }
}
