package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_82 {
    private final Production59_82 production = new Production59_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}