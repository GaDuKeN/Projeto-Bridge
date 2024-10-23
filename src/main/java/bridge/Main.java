// Main.java
package bridge;

public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TV();
        ControleRemoto controleTV = new ControleRemotoAvancado(tv);
        controleTV.ligarDesligar();
        controleTV.aumentarVolume();
        controleTV.proximoCanal();
        tv.imprimirStatus();

        Dispositivo radio = new Radio();
        ControleRemoto controleRadio = new ControleRemoto(radio);
        controleRadio.ligarDesligar();
        controleRadio.diminuirVolume();
        controleRadio.canalAnterior();
        radio.imprimirStatus();
    }
}
