package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8061 {
    private final Productionnull_8061 production = new Productionnull_8061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}