package exercicio2;

public class Revista extends Exemplares
{
    private String nome;
    private String categoria;
    private String editora;
    private int ano;
    
    @Override
    public String realizarEmprestimo(int codigo) {
        if ( codigo >0 && codigo <=25){
            return "Prazo de devolução da revista – 15 dias";
        }
        else if (codigo>25 && codigo <=40){
            return "Prazo de devolução da revista – 25 dias";
        }
        return null;      
    }

    @Override
    public String realizarDevolucao(int codigo, boolean atraso) {
        if ( codigo >0 && codigo<=25){
            return "Valor do empréstimo da revista – R$10,00";
        }
        else if (codigo>25 && codigo<=40){
            return "Valor do empréstimo da revista – R$15,00";
        }
        else if (atraso == true ) {
            return "Revista em atrasado ";
        }
        return null;
    }
    
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria) 
    {
        if (categoria.equals(" TI") || categoria.equals("ADM") || categoria.equals(" EE"))
        {
        this.categoria = categoria;    
        }
        else 
            this.categoria = "Sem categoria";
    }

    public String getEditora() 
    {
        return editora;
    }

    public void setEditora(String editora) 
    {
        this.editora = editora;
    }

    public int getAno() 
    {
        return ano;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }
    
}
