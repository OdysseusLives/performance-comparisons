package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_422 {
    private final Production15_422 production = new Production15_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}