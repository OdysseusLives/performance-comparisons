package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_202 {
    private final Production49_202 production = new Production49_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}