package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_1 {
    private final Production24_1 production = new Production24_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}