// TVTest.java
package bridge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TVTest {
    private TV tv;

    @BeforeEach
    public void setUp() {
        tv = new TV();
    }

    @Test
    public void testLigar() {
        tv.ligar();
        assertTrue(tv.isLigado(), "A TV deveria estar ligada.");
    }

    @Test
    public void testDesligar() {
        tv.ligar();
        tv.desligar();
        assertFalse(tv.isLigado(), "A TV deveria estar desligada.");
    }

    @Test
    public void testAjustarVolume() {
        tv.setVolume(50);
        assertEquals(50, tv.getVolume(), "O volume deveria ser 50.");
        tv.setVolume(150); // Testando volume acima do limite
        assertEquals(100, tv.getVolume(), "O volume não pode ser maior que 100.");
        tv.setVolume(-10); // Testando volume abaixo do limite
        assertEquals(0, tv.getVolume(), "O volume não pode ser menor que 0.");
    }

    @Test
    public void testAjustarCanal() {
        tv.setCanal(5);
        assertEquals(5, tv.getCanal(), "O canal deveria ser 5.");
    }
}
