package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_6 {
    private final Production76_6 production = new Production76_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}