package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_134 {
    private final Production27_134 production = new Production27_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}