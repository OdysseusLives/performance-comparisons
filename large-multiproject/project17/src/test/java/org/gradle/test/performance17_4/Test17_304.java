package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_304 {
    private final Production17_304 production = new Production17_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}