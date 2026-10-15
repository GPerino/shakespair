package org.perino;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void TestHelloWorld() {
        String returnedString = Main.HelloWorld();

        Assertions.assertEquals("Hello World", returnedString);
    }
}