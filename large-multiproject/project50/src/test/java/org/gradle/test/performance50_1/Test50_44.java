package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_44 {
    private final Production50_44 production = new Production50_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}