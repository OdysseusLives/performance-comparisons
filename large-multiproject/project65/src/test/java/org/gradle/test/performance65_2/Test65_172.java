package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_172 {
    private final Production65_172 production = new Production65_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}