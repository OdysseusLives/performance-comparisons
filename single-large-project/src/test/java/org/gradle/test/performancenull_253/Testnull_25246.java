package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25246 {
    private final Productionnull_25246 production = new Productionnull_25246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}