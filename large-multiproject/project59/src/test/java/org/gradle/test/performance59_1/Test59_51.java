package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_51 {
    private final Production59_51 production = new Production59_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}