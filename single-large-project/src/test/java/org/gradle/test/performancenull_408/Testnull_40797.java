package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40797 {
    private final Productionnull_40797 production = new Productionnull_40797("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}