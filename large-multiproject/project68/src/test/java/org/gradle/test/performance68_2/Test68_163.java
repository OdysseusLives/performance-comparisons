package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_163 {
    private final Production68_163 production = new Production68_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}