package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_85 {
    private final Production73_85 production = new Production73_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}