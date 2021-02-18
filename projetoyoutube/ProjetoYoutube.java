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
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video ("Aula 03 de JavaScript");
        v[2] = new Video ("Aula 01 de React Native");
        
        v[0].play();
        
        for(int i = 0; i <3; i++){
            System.out.println(v[i].toString());
        }
        System.out.println();
        
        Gafanhoto g = new Gafanhoto("Diego","M","diegonzales",25);
         System.out.println(g.toString());
         
         Visualizacao vis[] = new Visualizacao[3];
         
         vis[0] = new Visualizacao(g,v[2]);
         
          
                 
         System.out.println(vis[0].toString());
        
    }
    
}
