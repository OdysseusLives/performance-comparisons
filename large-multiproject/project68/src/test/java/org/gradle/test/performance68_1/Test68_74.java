package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_74 {
    private final Production68_74 production = new Production68_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}