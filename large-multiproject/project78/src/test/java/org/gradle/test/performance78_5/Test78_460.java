package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_460 {
    private final Production78_460 production = new Production78_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}