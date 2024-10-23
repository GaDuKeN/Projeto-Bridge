// ControleRemotoTest.java
package bridge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControleRemotoTest {
    private ControleRemoto controle;
    private TV tv;

    @BeforeEach
    public void setUp() {
        tv = new TV();
        controle = new ControleRemoto(tv);
    }

    @Test
    public void testLigarDesligar() {
        controle.ligarDesligar();
        assertTrue(tv.isLigado(), "A TV deveria estar ligada.");
        controle.ligarDesligar();
        assertFalse(tv.isLigado(), "A TV deveria estar desligada.");
    }

    @Test
    public void testAumentarVolume() {
        tv.ligar();
        controle.aumentarVolume();
        assertEquals(40, tv.getVolume(), "O volume deveria ser 40.");
    }

    @Test
    public void testDiminuirVolume() {
        tv.ligar();
        controle.diminuirVolume();
        assertEquals(20, tv.getVolume(), "O volume deveria ser 20.");
    }

    @Test
    public void testProximoCanal() {
        tv.ligar();
        controle.proximoCanal();
        assertEquals(2, tv.getCanal(), "O canal deveria ser 2.");
    }

    @Test
    public void testCanalAnterior() {
        tv.ligar();
        tv.setCanal(2);
        controle.canalAnterior();
        assertEquals(1, tv.getCanal(), "O canal deveria ser 1.");
    }
}
