package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_172 {
    private final Production17_172 production = new Production17_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}