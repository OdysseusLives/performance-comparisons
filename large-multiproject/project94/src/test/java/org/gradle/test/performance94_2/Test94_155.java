package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_155 {
    private final Production94_155 production = new Production94_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}