package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_127 {
    private final Production52_127 production = new Production52_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}