package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38561 {
    private final Productionnull_38561 production = new Productionnull_38561("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}