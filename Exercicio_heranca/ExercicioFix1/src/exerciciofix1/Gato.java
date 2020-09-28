package exerciciofix1;

public class Gato extends Mamifero
{
        private String corPelo;
        private String corOlhos;

    public Gato(String nome, String sexo, int idade, String raça, String CorPelo, String corOlhos)
    {
        super(nome, sexo, idade, raça);
        this.corOlhos = corOlhos;
        this.corPelo = corPelo;    
    }
    public String getCorPelo() 
    {
        return corPelo;
    }
    public void setCorPelo(String corPelo) 
    {
        this.corPelo = corPelo;
    }
    public String getCorOlhos()
    {
        return corOlhos;
    }
    public void setCorOlhos(String corOlhos) 
    {
        this.corOlhos = corOlhos;
    }    
}