package animais;

/**
 *
 * @author Diego
 */
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setCorPelo("Preto e Branco");
        m.setPeso(3);
        m.setIdade(2);
        m.setMembros(4);
        
        
        r.setCorEscama("Verde e azul");
        r.setPeso(1.4f);
        r.setIdade(5);
        r.setMembros(4);
        
        p.setCorEscama("Preto azul e vermelho");
        p.setPeso(2.230f);
        p.setIdade(1);
        p.setMembros(0);
        
        a.setCorPena("Preta e branco");
        a.setPeso(2.250f);
        a.setIdade(3);
        a.setMembros(2);
        a.status();
    }
    
}
