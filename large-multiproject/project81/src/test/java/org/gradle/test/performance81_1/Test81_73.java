package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_73 {
    private final Production81_73 production = new Production81_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}