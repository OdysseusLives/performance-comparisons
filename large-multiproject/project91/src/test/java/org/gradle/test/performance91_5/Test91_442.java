package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_442 {
    private final Production91_442 production = new Production91_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}