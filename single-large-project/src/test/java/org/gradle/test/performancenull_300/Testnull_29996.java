package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29996 {
    private final Productionnull_29996 production = new Productionnull_29996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}