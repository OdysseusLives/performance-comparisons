package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_435 {
    private final Production68_435 production = new Production68_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}