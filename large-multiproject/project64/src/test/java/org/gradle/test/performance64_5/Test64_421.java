package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_421 {
    private final Production64_421 production = new Production64_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}