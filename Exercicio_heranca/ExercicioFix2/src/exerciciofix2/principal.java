package exerciciofix2;

public class principal
{
    public static void main(String[] args) 
    {
        Pessoa jose = new Pessoa(1,"Jose","15/02/2020");
        System.out.println("Nome: " + jose.getNome() +"\nData de cadastro: " +jose.getDataCadastro() + "\nCódigo: "+jose.getCódigo());
       
        Usuario geraldo = new Usuario  (2,"Geraldo", "11/03/2020", "geraldo12", "123");
        System.out.println("\nNome: " + geraldo.getNome() +"\nData de cadastro: " +geraldo.getDataCadastro() + "\nCódigo: "+geraldo.getCódigo()+"\nLogin: "+geraldo.getLogin()+"\nSenha: " +geraldo.getSenha() );
        
        Cliente ana = new Cliente (3,"Ana","03/01/2020", "ana@live.com", "Rua Portugal, 150 - são vicente" , "38998457856");
        System.out.println("\nNome: " +ana.getNome()+"\nData de cadastro: "+ana.getDataCadastro()+ "\nE-mail: "+ana.getEmail()+"\nEndereço: " +ana.getEndereco()+ "\nTelefone: " +ana.getTelefone());
        
    }

}
