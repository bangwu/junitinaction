package com.thoughtworks.lesson.one;
import com.thoughtworks.lesson.one.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 5/24/15.
 */
public class CalculatorTest {

    @Test
    public void should_give_1_and_2_and_return_3(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(1, 2), 3, 0.1);
    }

    @Test
    public void should_give_two_double_number_and_return_one_double() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(1.2, 2.4), 3.6, 0.1);
    }
}
