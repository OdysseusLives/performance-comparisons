package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_172 {
    private final Production90_172 production = new Production90_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}