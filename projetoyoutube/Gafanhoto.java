/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author Diego
 */
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    
    public Gafanhoto(String nome, String sexo,String login, int idade) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm(){
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + " \nlogin= " + getLogin() + ", totAssistido= " + totAssistido + '}';
    } 
}


