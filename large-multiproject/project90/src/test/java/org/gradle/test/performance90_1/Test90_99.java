package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_99 {
    private final Production90_99 production = new Production90_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}