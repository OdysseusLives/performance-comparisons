package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_326 {
    private final Production51_326 production = new Production51_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}