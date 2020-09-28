package Exercicio1;

public class TrianguloEscaleno extends Triangulo
{
    public double calcularArea()
    {  
        return ((super.getLadoB()*super.getLadoC())*Math.sin(super.getLadoA()))/2;
    }
}
