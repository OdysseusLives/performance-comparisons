package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_197 {
    private final Production36_197 production = new Production36_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}