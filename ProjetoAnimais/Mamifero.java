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
public class Mamifero extends Animal{
    private String corPelo;

    
    public void status(){
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Cor do pelo: " + this.getCorPelo());
        System.out.println("Membros: " + this.getMembros());
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Andando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo..");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som!!!");
    }
    
}
