package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_226 {
    private final Production39_226 production = new Production39_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}