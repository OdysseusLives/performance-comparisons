package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_222 {
    private final Production34_222 production = new Production34_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}