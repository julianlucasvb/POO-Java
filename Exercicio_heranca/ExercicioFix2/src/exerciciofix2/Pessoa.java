package exerciciofix2;

public class Pessoa 
{
    private int código;
    private String nome;
    private String dataCadastro;

    public int getCódigo() 
    {
        return código;
    }
    public void setCódigo(int código)
    {
        this.código = código;
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        
        this.nome = nome;
    }
    public String getDataCadastro() 
    {
        return dataCadastro;
    }
    public void setDataCadastro(String dataCadastro) 
    {
        this.dataCadastro = dataCadastro;
    }
    public Pessoa(int código, String nome, String dataCadastro) 
    {
        this.código = código;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }
}
