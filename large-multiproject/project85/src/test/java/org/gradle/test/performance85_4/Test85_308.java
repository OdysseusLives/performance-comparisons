package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_308 {
    private final Production85_308 production = new Production85_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}