package banco;
public final class contaBanco {
    public float numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void contaBanco(String tipo, boolean status) {
        this.tipo = tipo;
        this.status = status;
    }
    
     public void estadoAtual(){
        System.out.println("----------------");
        System.out.println("Conta: "+ this.numConta);
        System.out.println("Nome: " + getDono());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        
    }
    
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        
        if(null == t) {
            System.out.println("CC para Conta Corrente ou CP para Conta Poupança");
        } else switch (t) {
            case "CC":
            case "cc":
                setSaldo(50f);
                System.out.println("Conta aberta com sucesso!!!");
                break;
            case "CP":
            case "cp":
                setSaldo(150f);
                System.out.println("Conta aberta com sucesso!!");
                break;
            default:
                System.out.println("CC para Conta Corrente ou CP para Conta Poupança");
                break;
        }
    }
    
    public void fecharConta() {
        if(getSaldo() > 0){
            System.out.println("Impossivel fechar conta, zerar saldo primeiro");
        }else if(getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }
    
    public void depositar(float valor) {
        if(getStatus() == true) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Conta inexistente!! Abra uma conta primeiro");
        }
    }
    
    public void sacar(float valor) {
        if(getStatus()){
            if(getSaldo() < valor){
                System.out.println("Saldo Insuficiente!!");
            }else {
                setSaldo(getSaldo() - valor);
            }
        }else {
            System.out.println("Conta inexistente!!");
        }
    }
    
    public void pagarMensal() {
        int v =0;
        
        if("CC".equals(getTipo()) || "cc".equals(getTipo())){
            v = 10;
        }else if("CP".equals(getTipo()) || "cp".equals(getTipo())){
            v =20;
        }
        if(getStatus()){
            if(getSaldo() > v){
                setSaldo(getSaldo() - v);
            }else {
                System.out.println("Saldo Insuficiente!!");
            }
        }else {
            System.out.println("Conta inexistente!");
        }
    }
    
    public float getNumConta() { return this.numConta; }
    public void setNumConta(float n) { this.numConta = n; }
    
    public String getTipo() { return this.tipo; }
    public void setTipo(String t) { this.tipo = t; }
    
    public String getDono() { return this.dono; }
    public void setDono(String d) { this.dono = d; }
    
    public float getSaldo() { return this.saldo; }
    public void setSaldo(float s) { this.saldo = s; }
    
    public boolean getStatus() { return this.status; }
    public void setStatus(boolean s) { this.status = s; }
}
