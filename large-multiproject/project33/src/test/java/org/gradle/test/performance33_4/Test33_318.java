package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_318 {
    private final Production33_318 production = new Production33_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}