package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_37 {
    private final Production71_37 production = new Production71_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}