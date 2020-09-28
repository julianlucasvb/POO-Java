package exerciciofix1;
public class Mamifero 
{
    private String nome; 
    private String sexo;
    private int idade;
   private String raça;

    public Mamifero(String nome, String sexo, int idade, String raça)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.raça = raça;
    }
    public String getRaça() 
    {
        return raça;
    }
    public void setRaça(String raça) 
    {
        this.raça = raça;
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getSexo()
    {
        return sexo;
    }
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }  
}
