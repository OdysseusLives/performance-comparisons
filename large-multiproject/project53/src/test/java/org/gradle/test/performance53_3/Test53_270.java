package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_270 {
    private final Production53_270 production = new Production53_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}