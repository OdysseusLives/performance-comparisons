package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_253 {
    private final Production51_253 production = new Production51_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}