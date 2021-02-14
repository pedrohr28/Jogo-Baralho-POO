package teste;

public class Quadrado extends FormaBidimensional
{
    
    private double lado;
    
    public Quadrado(double lado)
    {
        this.lado = lado;
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
        a = this.lado*this.lado;
        this.setArea(a);
        return a;
    }
    
}
