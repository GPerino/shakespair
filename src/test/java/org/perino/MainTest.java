package org.perino;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void TestHelloWorld() {
        String returnedString = Main.HelloWorld();
        assertEquals("Hello World", returnedString);
    }
}