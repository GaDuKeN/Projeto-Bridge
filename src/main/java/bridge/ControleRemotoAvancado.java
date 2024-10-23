// ControleRemotoAvancado.java
package bridge;

public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
        dispositivo.setVolume(0);
        System.out.println("Dispositivo silenciado.");
    }
}
