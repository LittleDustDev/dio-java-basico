public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("------------------------------------------");
        smartTv.ligar(); //ligada true
        System.out.println("Está ligada? " + smartTv.ligada);
        smartTv.aumentarCanal(); //canal 2
        smartTv.aumentarCanal(); //canal 3
        smartTv.aumentarCanal(); //canal 4
        smartTv.diminuirCanal(); //canal 3
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarVolume(); //volume 26
        smartTv.aumentarVolume(); //volume 27
        smartTv.aumentarVolume(); //volume 28
        smartTv.aumentarVolume(); //volume 29
        smartTv.diminuirVolume(); //volume 28
        smartTv.diminuirVolume(); //volume 27
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("------------------------------------------");
        smartTv.mudarCanal(22); //canal 22
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.desligar(); //ligada false
        System.out.println("Está ligada? " + smartTv.ligada);

    }
}
