package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_200 {
    private final Production19_200 production = new Production19_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}