package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_415 {
    private final Production68_415 production = new Production68_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}