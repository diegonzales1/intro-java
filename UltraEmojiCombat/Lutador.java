package uec;
public final class Lutador {
    
    //Atributos 
    private String nome, nacionalidade, categoria;
    private int vitorias, derrotas, empates;
    private float altura,  peso;
    private int idade;
     
    //Métodos Abstratos
    public void apresentar(){
        System.out.println("---------------------------");
        System.out.println("Lutador: \t"+ getNome());
        System.out.println("Origem: \t" + getNacionalidade());
        System.out.println("Idade: \t\t" + getIdade() + " anos");
        System.out.println("Altura: \t" + getAltura() +"m");
        System.out.println("Pesando: \t" + getPeso() + "kg");
        System.out.println("Vitórias: \t" + getVitorias());
        System.out.println("Derrotas: \t" + getDerrotas());
        System.out.println("Empates: \t" + getEmpates());
        System.out.println("---------------------------");
    }
    
    public void status(){
        System.out.print("O lutador " + getNome().toUpperCase());
        System.out.print(" é um peso " + getCategoria() + " com ");
        System.out.print(getVitorias() + " vitória(s), ");
        System.out.print(getDerrotas() + " derrota(s) e ");
        System.out.println(getEmpates() + " empate(s).");
    }
    
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
    
    //Métodos Especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, 
                   float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
        setCategoria();
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    private void setCategoria(){
        
       if(this.peso < 52.2 || this.peso > 120.2){
           this.categoria = "Inválido";
       }else if(this.peso <= 70.3){
           this.categoria = "Leve";
       }else if(this.peso <= 83.9){
           this.categoria = "Médio";
       }else {
           this.categoria = "Pesado";
       }
    }
    
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    
    public int getEmpates(){
        return empates;
    }
    
    public void setEmpates(int empates){
        this.empates = empates;
    }
       
}
