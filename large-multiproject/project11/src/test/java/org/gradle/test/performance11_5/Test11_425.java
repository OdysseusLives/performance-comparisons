package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_425 {
    private final Production11_425 production = new Production11_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}