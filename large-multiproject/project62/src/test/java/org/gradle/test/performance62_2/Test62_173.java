package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_173 {
    private final Production62_173 production = new Production62_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}