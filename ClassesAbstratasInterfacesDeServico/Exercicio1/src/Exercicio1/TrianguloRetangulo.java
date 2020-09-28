package Exercicio1;

public class TrianguloRetangulo extends Triangulo
{
    public double calcularArea()
    {
        return (super.getLadoA() * super.getLadoB()) / 2;
    }
}