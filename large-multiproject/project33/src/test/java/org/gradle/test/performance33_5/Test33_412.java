package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_412 {
    private final Production33_412 production = new Production33_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}