package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_68 {
    private final Production98_68 production = new Production98_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}