package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_64 {
    private final Production33_64 production = new Production33_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}