import com.thoughtworks.lesson.one.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(1, 2), 3);
    }
}
