package SistemaSmartTv;

public class Usuario {
    public static void main(String [] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual : " + smartTv.volume);


        System.out.println("TV Ligada : " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);
    
        smartTv.ligar();
        System.out.println("Novo Status -> A TV esta ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A TV esta desligada? " + smartTv.ligada);
    
    }


    
}
