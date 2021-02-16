package uec;
import java.util.Random;
public class Luta {
    
    //Atributos
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Principais
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("Desafiado: ");
            desafiado.status();
            System.out.println("Desafiante: ");
            desafiante.status();
            System.out.println("");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("----------RESULTADO--------");
            switch(vencedor){
                case 0://Empate
                    System.out.println("Empatou!!".toUpperCase());
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado Vence
                    System.out.println("Vitória do ".toUpperCase() + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break; 
                case 2://Desafiante Vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    System.out.print("Error!!!");
                    break;
            }
        }else {
            System.out.println("A luta não pode acontecer!!");
        }
        
    }
    
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
}
