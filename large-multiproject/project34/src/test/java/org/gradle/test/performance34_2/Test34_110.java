package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_110 {
    private final Production34_110 production = new Production34_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}