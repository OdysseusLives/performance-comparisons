package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_435 {
    private final Production91_435 production = new Production91_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}