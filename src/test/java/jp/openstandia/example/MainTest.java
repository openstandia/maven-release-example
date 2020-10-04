package jp.openstandia.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void hello() {
        Assertions.assertEquals("Hello", new Main().hello());
    }
}
