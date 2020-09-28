

package Exercicio1;


public abstract class Triangulo 
{

    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public double getLadoA() 
    {
        return ladoA;
    }
    public void setLadoA(double ladoA) 
    {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) 
    {
        this.ladoB = ladoB;
    }
    public double getLadoC() 
    {
        return ladoC;
    }
    public void setLadoC(double ladoC) 
    {
        this.ladoC = ladoC;
    }
    public abstract double calcularArea();
    
    public String mostraInformacoes()
    {
        return "Lado A: "+ladoA+"\nLabo B: "+ladoB+"\nLado C: "+ladoC;
    }  
}