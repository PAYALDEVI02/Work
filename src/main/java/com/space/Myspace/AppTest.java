import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMul() {
        App a = new App();
        int res = a.mul(4, 5);
        assertEquals(22, res);
    }
}
