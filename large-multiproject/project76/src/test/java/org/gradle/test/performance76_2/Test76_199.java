package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_199 {
    private final Production76_199 production = new Production76_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}