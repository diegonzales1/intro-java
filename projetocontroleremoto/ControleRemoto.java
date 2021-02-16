package projetocontroleremoto;
public class ControleRemoto implements Controlador {
    
    private int volume;
    private int canal;
    private boolean ligando;
    private boolean tocando;
    
    //Métodos Abstratos
    
    @Override
    public void abrirMenu(){
        System.out.println("-----------MENU-----------");
        System.out.println("Está ligado?: " + this.getLigando());
        System.out.println("Está tocando?: "+ this.getTocando());
        if(this.getLigando()){
            System.out.println("Canal: " + this.getCanal());
        }
        if(this.getLigando() && this.getTocando()){
            System.out.print("Volume: " + this.getVolume());
        
                for(int i = 10; i <= this.getVolume() ; i+=10){
                    System.out.print(" [] ");
                }
        }
        System.out.println("");
        System.out.println("---------------------------");
    }
    
    @Override
    public void ligar(){
       this.setLigando(true);
       this.setTocando(true);
    }
    
    @Override
    public void desligar(){
        this.setLigando(false);
        this.setTocando(false);
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu");
    }
    
    @Override
    public void maisVolume(){
        if(this.getLigando()){
            this.setVolume(getVolume() + 5);
        }
    }
    
    @Override
    public void menosVolume(){
        if(this.getLigando()){
            this.setVolume(this.getVolume() - 5);
        }
    }
    
    @Override
    public void ligarMudo(){
        if(this.getLigando() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo(){
        if(this.getLigando() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    @Override
    public void play(){
        if(this.getLigando() && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    
    @Override
    public void pause(){
        if(this.getLigando() && this.getTocando()){
           this.setTocando(true);
        }
    }
    
    @Override
    public void mudarCanal(){
        if(this.getLigando() && this.getTocando()){
            this.setCanal(this.getCanal() + 1);
        }
    }
    
    @Override
    public void voltarCanal() {
        if(this.getLigando() && this.getTocando()){
            this.setCanal(this.getCanal() -1);
        }
    }
    //Métodos especiais
    
     public ControleRemoto(){
        this.volume = 50;
        this.canal = 01;
        this.ligando = false;
        this.tocando = false;
    }
    
     private int getCanal(){
         return this.canal;
     }
     
     private void setCanal(int canal){
         this.canal = canal;
     }
     
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean getLigando(){
        return this.ligando;
    }
    
    private void setLigando(boolean ligando){
        this.ligando = ligando;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

   
}
