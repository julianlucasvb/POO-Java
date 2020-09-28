package exercicio2;

public class Principal {

    public static void main(String[] args) 
    {
        Livro livro = new Livro();
        Livro livro2 = new Livro();
        Revista revista = new Revista();
        Revista revista2 = new Revista();
        
        livro.realizarEmprestimo(2);
        livro.setAutor("Julian");
        livro.setEdicao(4);
        livro.setEditora("Villas Boas");
        livro.setISBN(1245);
        livro.setTitulo("Trabalho");
        System.out.println(livro.realizarDevolucao(2, false));
        
        livro2.realizarEmprestimo(15);
        livro2.setAutor("Sarah");
        livro2.setEdicao(1);
        livro2.setEditora("Pereira's");
        livro2.setISBN(5342);
        livro2.setTitulo("300");
        System.out.println(livro2.realizarDevolucao(15, true));
        
        revista.realizarEmprestimo(6);
        revista.setAno(2001);
        revista.setCategoria("Comédia");
        revista.setEditora("Pereira's");
        revista.setNome("301");
        System.out.println(revista.realizarDevolucao(6, false));    
    
        revista2.realizarEmprestimo(28);
        revista2.setAno(2019);
        revista2.setCategoria("Terror");
        revista2.setEditora("Villas Boas");
        revista2.setNome("Mansão Mau Assombrada");
        System.out.println(revista2.realizarDevolucao(28, true));
    }
}
