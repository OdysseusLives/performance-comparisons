package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_146 {
    private final Production59_146 production = new Production59_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}