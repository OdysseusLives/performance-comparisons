package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_270 {
    private final Production68_270 production = new Production68_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}