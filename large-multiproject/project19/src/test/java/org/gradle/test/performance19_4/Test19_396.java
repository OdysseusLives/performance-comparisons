package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_396 {
    private final Production19_396 production = new Production19_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}