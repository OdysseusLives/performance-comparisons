package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27041 {
    private final Productionnull_27041 production = new Productionnull_27041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}