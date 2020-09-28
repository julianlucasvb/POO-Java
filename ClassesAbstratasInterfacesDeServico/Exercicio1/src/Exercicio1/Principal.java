

package Exercicio1;


public class Principal {

    
    public static void main(String[] args) 
    {
        TrianguloEquilatero trianguloequi = new TrianguloEquilatero();
        
        trianguloequi.setLadoA(3);
        System.out.println(trianguloequi.mostraInformacoes()+"\nÁrea: "+trianguloequi.calcularArea());
        
        TrianguloEscaleno trianguloesc = new TrianguloEscaleno();
        
        trianguloesc.setLadoA(0);
        trianguloesc.setLadoB(8);
        trianguloesc.setLadoC(11);
        System.out.println(trianguloesc.mostraInformacoes()+"\nÁrea: "+trianguloesc.calcularArea());
        
        TrianguloRetangulo trianguloret = new TrianguloRetangulo();
        
        trianguloret.setLadoA(3);
        trianguloret.setLadoB(3);
        System.out.println(trianguloret.mostraInformacoes()+"\nÁrea: "+trianguloret.calcularArea());
    }

}
