package exerciciofix1;
public class Humano extends Mamifero
{
    private Double altura;
    private Double peso; 

    public Humano(String nome, String sexo, int idade, String raça, Double altura, Double peso) 
    {
        super(nome, sexo, idade, raça);
        this.altura = altura;
        this.peso = peso;
    }
    public Double getAltura() 
    {
        return altura;
    }
    public void setAltura(Double altura)
    {
        this.altura = altura;
    }
    public Double getPeso() 
    {
        return peso;
    }
    public void setPeso(Double peso)
    {
        this.peso = peso;
    }
}
