package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_215 {
    private final Production53_215 production = new Production53_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}