package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_449 {
    private final Production60_449 production = new Production60_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}