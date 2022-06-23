package com.thealgorithms.test;

import com.thealgorithms.main.GCD;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// mutation test for GCD
public class MutationTest {
    @Test
    void test1() {
        Assertions.assertThrows(ArithmeticException.class, () -> GCD.gcd(-1,0));
    }
}
