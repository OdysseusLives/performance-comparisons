package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_350 {
    private final Production51_350 production = new Production51_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}