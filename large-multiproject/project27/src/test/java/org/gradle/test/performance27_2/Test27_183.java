package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_183 {
    private final Production27_183 production = new Production27_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}