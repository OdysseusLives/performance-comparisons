package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_272 {
    private final Production64_272 production = new Production64_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}