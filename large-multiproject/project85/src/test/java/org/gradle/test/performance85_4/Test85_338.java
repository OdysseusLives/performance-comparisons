package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_338 {
    private final Production85_338 production = new Production85_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}