package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_227 {
    private final Production25_227 production = new Production25_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}