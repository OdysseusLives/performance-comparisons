package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_102 {
    private final Production17_102 production = new Production17_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}