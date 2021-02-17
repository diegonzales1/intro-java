package animais;

/**
 *
 * @author Diego
 */
public class Reptil extends Animal{
    private String corEscama;

      public void status(){
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Cor da escama: " + this.getCorEscama());
        System.out.println("Membros: " + this.getMembros());
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }
      
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando..");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos..");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som....");
    }
}
