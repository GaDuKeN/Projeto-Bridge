// ControleRemoto.java
package bridge;

public class ControleRemoto {
    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligarDesligar() {
        if (dispositivo.isLigado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

    public void aumentarVolume() {
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    public void diminuirVolume() {
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }

    public void proximoCanal() {
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }

    public void canalAnterior() {
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }
}
