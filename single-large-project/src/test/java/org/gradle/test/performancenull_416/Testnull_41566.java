package org.gradle.test.performancenull_416;

import static org.junit.Assert.*;

public class Testnull_41566 {
    private final Productionnull_41566 production = new Productionnull_41566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}