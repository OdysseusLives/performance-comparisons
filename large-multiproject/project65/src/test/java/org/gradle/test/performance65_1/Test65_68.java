package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_68 {
    private final Production65_68 production = new Production65_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}