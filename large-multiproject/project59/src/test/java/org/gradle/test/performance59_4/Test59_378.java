package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_378 {
    private final Production59_378 production = new Production59_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}