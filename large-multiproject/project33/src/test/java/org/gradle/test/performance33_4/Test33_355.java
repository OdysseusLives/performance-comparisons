package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_355 {
    private final Production33_355 production = new Production33_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}