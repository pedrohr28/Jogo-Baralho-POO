package teste;
import static java.lang.Math.*;
/**
 *
 * @author aluno
 */
public class Esfera extends FormaTridimensional
{
    private double raio;
    public Esfera(double raio)
     {
        super();
        this.raio = raio;
    }

    @Override
    public double calculoVolume() 
    {
        double v;
        v = 4/3*Math.PI*Math.pow(this.raio, 3);
        this.setVolume(v);
        return v;
    }

    @Override
    public double calculoArea() 
    {
        double a;
        a = 4*Math.PI*Math.pow(this.raio,2);
        this.setArea(a);
        return a;
    }
}

