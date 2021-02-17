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
        Cachorro c = new Cachorro();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Gato g = new Gato();
        Lobo l = new Lobo();
        Ave a = new Ave();
        
        m.setCorPelo("Preto e Branco");
        m.setPeso(3);
        m.setIdade(2);
        m.setMembros(4);
        //m.status();
        
        r.setCorEscama("Verde e azul");
        r.setPeso(1.4f);
        r.setIdade(5);
        r.setMembros(4);
        //r.status();
        
        p.setCorEscama("Preto azul e vermelho");
        p.setPeso(2.230f);
        p.setIdade(1);
        p.setMembros(0);
        //a.status();
        
        a.setCorPena("Preta e branco");
        a.setPeso(2.250f);
        a.setIdade(3);
        a.setMembros(2);
        //a.status();
        
        l.setCorPelo("Preta e branco");
        l.setPeso(15.600f);
        l.setIdade(15);
        l.setMembros(4);
        //l.status();
        
        c.setCorPelo("Caramelo");
        c.setPeso(5.500f);
        c.setIdade(3);
        c.setMembros(4);
        //c.status();
        
        g.setCorPelo("Cinza, branca, amarelo e preto");
        g.setPeso(2.250f);
        g.setIdade(12);
        g.setMembros(4);
        //g.status();
        
    }
    
}
