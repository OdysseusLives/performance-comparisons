package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_11 {
    private final Production52_11 production = new Production52_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}