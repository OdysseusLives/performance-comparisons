package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_441 {
    private final Production53_441 production = new Production53_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}