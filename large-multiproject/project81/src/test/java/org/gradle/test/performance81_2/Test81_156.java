package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_156 {
    private final Production81_156 production = new Production81_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}