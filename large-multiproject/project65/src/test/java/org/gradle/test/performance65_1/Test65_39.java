package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_39 {
    private final Production65_39 production = new Production65_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}