package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_47 {
    private final Production11_47 production = new Production11_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}