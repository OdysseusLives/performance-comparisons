package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_61 {
    private final Production81_61 production = new Production81_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}