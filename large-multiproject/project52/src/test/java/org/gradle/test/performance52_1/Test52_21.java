package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_21 {
    private final Production52_21 production = new Production52_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}