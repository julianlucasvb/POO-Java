package exerciciofix2;

public class Cliente extends Pessoa
{
    private String email;
    private String endereco;
    private String telefone;

    public Cliente(int código, String nome, String dataCadastro, String email, String endereco, String telefone)
    {
        super(código, nome, dataCadastro);
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
    public String getTelefone() 
    {
        return telefone;
    }
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
}
