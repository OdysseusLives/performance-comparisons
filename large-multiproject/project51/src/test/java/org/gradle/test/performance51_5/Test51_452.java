package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_452 {
    private final Production51_452 production = new Production51_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}