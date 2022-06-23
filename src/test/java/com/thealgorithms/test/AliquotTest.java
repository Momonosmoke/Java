package com.thealgorithms.test;

import com.thealgorithms.maths.AliquotSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AliquotTest {
    @Test
    void testGetMaxValue() {
        assertEquals(0, AliquotSum.getAliquotValue(1));
        assertEquals(6, AliquotSum.getAliquotValue(6));
        assertEquals(9, AliquotSum.getAliquotValue(15));
        assertEquals(1, AliquotSum.getAliquotValue(19));
    }
}
