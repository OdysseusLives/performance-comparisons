package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_331 {
    private final Production68_331 production = new Production68_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}