package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_217 {
    private final Production33_217 production = new Production33_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}