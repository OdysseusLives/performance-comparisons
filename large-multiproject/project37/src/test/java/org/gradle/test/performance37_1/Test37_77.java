package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_77 {
    private final Production37_77 production = new Production37_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}