// Radio.java
package bridge;

public class Radio implements Dispositivo {
    private boolean ligado = false;
    private int volume = 50;
    private int canal = 88;

    @Override
    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Rádio ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Rádio desligado");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
        System.out.println("Volume do rádio ajustado para " + this.volume);
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal do rádio ajustado para " + this.canal);
    }

    @Override
    public void imprimirStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Estou usando o Rádio.");
        System.out.println("| Está " + (ligado ? "ligado" : "desligado"));
        System.out.println("| Volume atual: " + volume);
        System.out.println("| Canal atual: " + canal);
        System.out.println("------------------------------------\n");
    }
}
