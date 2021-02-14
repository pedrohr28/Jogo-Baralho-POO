package teste;


/**
 *
 * @author aluno
 */
public class Circulo extends FormaBidimensional
{
    private double raio;
    
    public Circulo(double raio)
    {
        this.raio = raio;        
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
        a = Math.PI*(Math.pow(this.raio, 2));
        this.setArea(a);
        return a;
    }
}