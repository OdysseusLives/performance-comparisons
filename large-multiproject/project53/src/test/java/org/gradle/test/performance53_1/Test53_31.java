package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_31 {
    private final Production53_31 production = new Production53_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}