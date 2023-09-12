package SistemaSmartTv;
    
public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public String desligar;

    public void aumentarVolume(){
        System.out.println("Aumentar o volume " + volume);
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("Diminuir  o volume " + volume);
        volume--;
    }
        


    public void ligar(){
        ligada = true;
        
    }
    public void desligar(){
        ligada = false;
        
    }
}
