package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_468 {
    private final Production17_468 production = new Production17_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}