package com.thoughtworks.lesson.two;

import com.thoughtworks.lesson.two.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Thoughtworks on 5/24/15.
 */
@RunWith(value = Parameterized.class)
public class CalculatorTest {

    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters(){
        return Arrays.asList(
                new Integer[][]{
                        {2, 1, 1},
                        {3, 2, 1},
                        {4, 3, 1}
                }
        );
    }

    public CalculatorTest(double expected, double valueOne, double valueTwo) {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        assertEquals("test failed", calculator.add(valueOne, valueTwo), expected, 0);
    }
}
