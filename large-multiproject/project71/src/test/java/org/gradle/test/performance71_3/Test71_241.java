package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_241 {
    private final Production71_241 production = new Production71_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}