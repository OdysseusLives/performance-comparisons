package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_85 {
    private final Production62_85 production = new Production62_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}