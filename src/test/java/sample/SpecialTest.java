package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialTest {
    private final Special special = new Special();

    @Test
    public void testGo() {
        assertEquals("ABC", special.go());
    }

}