/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author Diego
 */
public class Lobo extends Mamifero{
    
    @Override
    public void emitirSom(){
        System.out.println("AUUUUUUUUUUL");
    }
    
     @Override
     public void status(){
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Cor do pelo: " + this.getCorPelo());
        System.out.println("Membros: " + this.getMembros());
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }
     
         @Override
    public void locomover() {
        System.out.println("Andando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo..");
    }
}
