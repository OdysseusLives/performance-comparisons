package org.gradle.test.performancenull_57;

import static org.junit.Assert.*;

public class Testnull_5601 {
    private final Productionnull_5601 production = new Productionnull_5601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}