package com.ozmen.junit;

import com.ozmen.junit.Assertions.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {  // MUT
        Calculator calc = new Calculator();  // == SUT
        int result = calc.add(2, 3); // = Act

        assertEquals(5, result, () -> "\n" +
                "The result 2+3 is wrong!");
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();

        assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0),
                "Should give a division by zero error");
    }

}