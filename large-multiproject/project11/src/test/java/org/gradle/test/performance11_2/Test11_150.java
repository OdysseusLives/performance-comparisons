package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_150 {
    private final Production11_150 production = new Production11_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}