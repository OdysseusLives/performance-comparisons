package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_138 {
    private final Production85_138 production = new Production85_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}