package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_271 {
    private final Production19_271 production = new Production19_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}