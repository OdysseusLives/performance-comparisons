package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_85 {
    private final Production6_85 production = new Production6_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}