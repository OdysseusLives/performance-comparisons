package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_500 {
    private final Production63_500 production = new Production63_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}