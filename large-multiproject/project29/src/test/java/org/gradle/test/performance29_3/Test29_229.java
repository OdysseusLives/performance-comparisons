package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_229 {
    private final Production29_229 production = new Production29_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}