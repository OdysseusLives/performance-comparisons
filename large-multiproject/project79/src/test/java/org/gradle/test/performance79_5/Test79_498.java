package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_498 {
    private final Production79_498 production = new Production79_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}