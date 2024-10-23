// RadioTest.java
package bridge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadioTest {
    private Radio radio;

    @BeforeEach
    public void setUp() {
        radio = new Radio();
    }

    @Test
    public void testLigar() {
        radio.ligar();
        assertTrue(radio.isLigado(), "O rádio deveria estar ligado.");
    }

    @Test
    public void testDesligar() {
        radio.ligar();
        radio.desligar();
        assertFalse(radio.isLigado(), "O rádio deveria estar desligado.");
    }

    @Test
    public void testAjustarVolume() {
        radio.setVolume(30);
        assertEquals(30, radio.getVolume(), "O volume deveria ser 30.");
        radio.setVolume(110); // Testando volume acima do limite
        assertEquals(100, radio.getVolume(), "O volume não pode ser maior que 100.");
        radio.setVolume(-5); // Testando volume abaixo do limite
        assertEquals(0, radio.getVolume(), "O volume não pode ser menor que 0.");
    }

    @Test
    public void testAjustarCanal() {
        radio.setCanal(95);
        assertEquals(95, radio.getCanal(), "O canal deveria ser 95.");
    }
}
