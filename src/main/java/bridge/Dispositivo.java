// Dispositivo.java
package bridge;

public interface Dispositivo {
    boolean isLigado();
    void ligar();
    void desligar();
    int getVolume();
    void setVolume(int volume);
    int getCanal();
    void setCanal(int canal);
    void imprimirStatus();
}
