package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_28 {
    private final Production2_28 production = new Production2_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}