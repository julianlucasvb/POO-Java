package Exercicio1;

public class TrianguloEquilatero extends Triangulo
{
    public double calcularArea()
    {
        return (super.getLadoA() * Math.sqrt(3))/4;
    }
}