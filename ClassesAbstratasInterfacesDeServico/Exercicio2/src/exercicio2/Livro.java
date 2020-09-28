package exercicio2;

public class Livro extends Exemplares
{
    private String Autor;
    private String Editora;
    private String Titulo;
    private int edicao;
    private int ISBN;
    
    public String getAutor() 
    {
        return Autor;
    }
    public void setAutor(String Autor) 
    {
        this.Autor = Autor;
    }
    public String getEditora() 
    {
        return Editora;
    }
    public void setEditora(String Editora) 
    {
        this.Editora = Editora;
    }
    public String getTitulo() 
    {
        return Titulo;
    }
    public void setTitulo(String Titulo) 
    {
        this.Titulo = Titulo;
    }
    public int getEdicao() 
    {
        return edicao;
    }
    public void setEdicao(int edicao) 
    {
        this.edicao = edicao;
    }
    public int getISBN() 
    {
        return ISBN;
    }
    public void setISBN(int ISBN) 
    {
        this.ISBN = ISBN;
    }
    public String realizarEmprestimo(int codigo) 
    {
    if(codigo>=1 || codigo<=10){
        return "Prazo de devolução do livro – 10 dias";
    }
    else if (codigo>=11 || codigo <=20){
        return "Prazo de devolução do livro – 15 dias";
    }
    else if (codigo>=21){
        return " Prazo de devolução do livro – indeterminado";
    }
        return null;
    }
    
    public String realizarDevolucao(int codigo, boolean atraso) 
    {
        if(codigo>=1 && codigo<10)
        {
            return "Valor do empréstimo do livro – R$10,00";
        }
        if (codigo>=11 && codigo <20)
        {
            return "Valor do empréstimo do livro – R$15,00";
        }
        if (codigo>=21)
        {
            return "Valor do empréstimo do livro – R$50,00";
        }
        if (atraso == true )
        {
            return "Livro atrasado";
        }
        return null;
    }        
}
