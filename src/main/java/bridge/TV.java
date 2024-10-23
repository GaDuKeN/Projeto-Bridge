// TV.java
package bridge;

public class TV implements Dispositivo {
    private boolean ligado = false;
    private int volume = 30;
    private int canal = 1;

    @Override
    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV desligada");
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
        System.out.println("Volume da TV ajustado para " + this.volume);
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal da TV ajustado para " + this.canal);
    }

    @Override
    public void imprimirStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Estou usando a TV.");
        System.out.println("| Está " + (ligado ? "ligada" : "desligada"));
        System.out.println("| Volume atual: " + volume);
        System.out.println("| Canal atual: " + canal);
        System.out.println("------------------------------------\n");
    }
}
