package playground.fancy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleSwitchTest {

    private final SampleSwitch x = new SampleSwitch();

    @Test
    void testNull() {
        assertEquals("nothing", x.render(null));
    }

    @Test
    void testString() {
        assertEquals("blub", x.render("blub"));
    }

    @Test
    void testNumber() {
        assertEquals("47.11", x.render(47.11));
    }

    @Test
    void testObj() {
        assertThrows(IllegalStateException.class, () -> x.render(x));
    }
}