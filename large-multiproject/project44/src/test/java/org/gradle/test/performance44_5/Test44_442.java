package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_442 {
    private final Production44_442 production = new Production44_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}