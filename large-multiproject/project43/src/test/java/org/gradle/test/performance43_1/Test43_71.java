package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_71 {
    private final Production43_71 production = new Production43_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}