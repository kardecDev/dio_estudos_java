public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.mostrarStatus();
        smartTv.ligar();
        smartTv.mostrarStatus();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(10);
        smartTv.diminuirVolume();
        smartTv.desligar();
        smartTv.mostrarStatus();
    }
}
