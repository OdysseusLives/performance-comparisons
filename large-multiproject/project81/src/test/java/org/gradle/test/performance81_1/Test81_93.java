package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_93 {
    private final Production81_93 production = new Production81_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}