package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_365 {
    private final Production17_365 production = new Production17_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}