package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(3,2));
    }
    void testSubtraction() {
        assertEquals(2, c.subtract(3,2));
    }

}
