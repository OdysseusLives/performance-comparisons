package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_75 {
    private final Production66_75 production = new Production66_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}