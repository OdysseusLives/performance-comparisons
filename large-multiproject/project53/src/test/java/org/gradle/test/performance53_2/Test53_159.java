package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_159 {
    private final Production53_159 production = new Production53_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}