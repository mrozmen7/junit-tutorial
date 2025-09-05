package com.ozmen.junit;

import com.ozmen.junit.Assertions.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FactorialTest {
    @Test
    public void factorialText() {
        Factorial fac = new Factorial();

        int actualResult = fac.factorial(6);

        assertEquals(720, actualResult, "The value should be 720 ");

    }

  
}