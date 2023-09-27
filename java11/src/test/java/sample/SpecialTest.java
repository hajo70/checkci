package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SpecialTest {
    private final Special special = new Special();
    @Test
    public void testGo() {
        assertEquals("A,B,C", special.go());
    }
}
