package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_15 {
    private final Production36_15 production = new Production36_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}