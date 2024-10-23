// ControleRemotoAvancadoTest.java
package bridge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControleRemotoAvancadoTest {
    private ControleRemotoAvancado controleAvancado;
    private TV tv;

    @BeforeEach
    public void setUp() {
        tv = new TV();
        controleAvancado = new ControleRemotoAvancado(tv);
    }

    @Test
    public void testSilenciar() {
        tv.ligar();
        controleAvancado.silenciar();
        assertEquals(0, tv.getVolume(), "O volume da TV deveria estar em 0.");
    }

    @Test
    public void testLigarDesligar() {
        controleAvancado.ligarDesligar();
        assertTrue(tv.isLigado(), "A TV deveria estar ligada.");
        controleAvancado.ligarDesligar();
        assertFalse(tv.isLigado(), "A TV deveria estar desligada.");
    }
}
