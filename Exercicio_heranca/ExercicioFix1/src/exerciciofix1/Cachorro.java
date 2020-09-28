package exerciciofix1;
public class Cachorro extends Mamifero
{
    private String corPelo; 
    private String corOlhos;

    public Cachorro(String nome, String sexo, int idade, String raça, String corPelo, String corOlhos) 
    {
        super(nome, sexo, idade, raça);
        this.corOlhos = corOlhos;
        this.corPelo = corPelo;
    }
    public String getCorPelo()
    {
        return corPelo;
    }
    public void setCorPelo(String CorPelo) 
    {
        this.corPelo = CorPelo;
    }
    public String getCorOlhos()
    {
        return corOlhos;
    }
    public void setCorOlhos(String CorOlhos)
    {
        this.corOlhos = CorOlhos;
    }
}
