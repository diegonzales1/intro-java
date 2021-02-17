package animais;

/**
 *
 * @author Diego
 */
public class Ave extends Animal{
    private String corPena;
    
      public void status(){
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Cor da pena: " + this.getCorPena());
        System.out.println("Membros: " + this.getMembros());
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }
      
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas e insetos...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo pio");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
