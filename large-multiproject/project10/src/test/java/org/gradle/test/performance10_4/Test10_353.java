package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_353 {
    private final Production10_353 production = new Production10_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}