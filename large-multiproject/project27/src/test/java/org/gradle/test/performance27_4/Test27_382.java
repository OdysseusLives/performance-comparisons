package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_382 {
    private final Production27_382 production = new Production27_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}