package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35943 {
    private final Productionnull_35943 production = new Productionnull_35943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}