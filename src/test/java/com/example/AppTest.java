package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAddition() {
        // Arrange (setup)
        Calculator calculator = new Calculator();

        // Act (perform the operation)
        int result = calculator.add(2, 3);

        // Assert (verify the result)
        assertEquals(5, result, "2 + 3 should be 5");
    }
}
