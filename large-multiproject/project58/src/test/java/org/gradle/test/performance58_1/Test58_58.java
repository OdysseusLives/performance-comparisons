package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_58 {
    private final Production58_58 production = new Production58_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}