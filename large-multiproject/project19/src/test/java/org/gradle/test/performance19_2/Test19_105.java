package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_105 {
    private final Production19_105 production = new Production19_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}