package exerciciofix3;

public class Animal
{
    private String nome;
    private String classe;
    private double peso;
    private double altura;     

    public Animal(String nome, String classe, double peso, double altura) 
    {
        this.nome = nome;
        this.classe = classe;
        this.peso = peso;
        this.altura = altura;
    }
    public String getNome() 
    {
        return nome;
    }
    public String getClasse() 
    {
        return classe;
    }
    public double getPeso() 
    {
        return peso;
    }
    public double getAltura() 
    {
        return altura;
    }
    
    public void retornainformacoes ()
    {
        
    }   
}
