package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_206 {
    private final Production78_206 production = new Production78_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}