package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_421 {
    private final Production76_421 production = new Production76_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}