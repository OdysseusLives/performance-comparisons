package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_82 {
    private final Production68_82 production = new Production68_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}