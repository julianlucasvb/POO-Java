package exerciciofix1;

public class principal
{
    public static void main(String[] args)
    {
        Mamifero mamifero = new Mamifero("Thor", "M", 10, "BRANCO" );
        System.out.println("Nome: "+mamifero.getNome()+"\nSexo: " + mamifero.getSexo()+"\nIdade: "+mamifero.getIdade()+"\nRaça: "+mamifero.getRaça());
        
        Gato gato = new Gato ("Java","F", 3, "Persa", "laranja", "marrom");
        System.out.println(gato.getCorPelo() +"\nCor dos Olhos: " +gato.getCorOlhos()+"\nNome: "+gato.getNome()+"\nSexo: " + gato.getSexo()+"\nIdade: "+gato.getIdade()+"\nRaça: "+gato.getRaça()+"\nCor do Pelo: ");
        
        Cachorro c = new Cachorro ("Linux","M",2, "husky siberiano", "Branco", "azul");
        System.out.println("\nNome: "+c.getNome()+"\nSexo: " + c.getSexo()+"\nIdade: "+c.getIdade()+"\nRaça: "+c.getRaça()+"\nCor do Pelo: " +c.getCorPelo() +"\nCor dos Olhos: "+c.getCorOlhos());
    }

}
