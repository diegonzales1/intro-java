package projetocontroleremoto;
public class ProjetoControleRemoto {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();
        
        cr.ligar();
        cr.mudarCanal();
        cr.abrirMenu();
        cr.fecharMenu();
    }  
}
