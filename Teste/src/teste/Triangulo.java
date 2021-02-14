package teste;

import static java.lang.Math.*;

public class Triangulo extends FormaBidimensional
{
    private double lado1;
    private double altura;
 
    public Triangulo(double lado1,double altura)
    {
        super();
        this.lado1 = lado1;
        this.altura = altura;
    }
    
    @Override
    public double calculoVolume() throws NaoExisteVolumeException 
    {
        throw new NaoExisteVolumeException();
    }


    @Override
    public double calculoArea() 
    {
        double a;
        a = (this.lado1*this.altura)/2;
        this.setArea(a);
        return a;
    }
}
