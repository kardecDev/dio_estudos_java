public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void mostrarStatus(){
        
        String statusTv = ligada ? "ON" : "OFF";

        if (ligada ) 
        {
            System.out.println("Tv Ligada?: " + statusTv);
            System.out.println("Canal Atual: " + canal);
            System.out.println("Volume Atual: " + volume);
        }
        else
        {
            System.out.println("Tv Ligada?: " + statusTv);   
        }
    }

    public void aumentarVolume(){
        volume++; 
        System.out.println("Aumentando volume para: " + volume);   
        
    }

    public void diminuirVolume(){
        volume--; 
        System.out.println("Diminuindo volume para: " + volume); 
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando Canal para: " + canal); 
    }

    public void aumentarCanal(){
        canal++; 
        System.out.println("Aumentando Canal para: " + canal); 
    }

    public void diminuirCanal(){
        canal--; 
        System.out.println("Aumentando Canal para: " + canal); 
    }
}
