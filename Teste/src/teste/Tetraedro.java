		package teste;

public class Tetraedro extends FormaTridimensional
{
    private double aresta;
    
    public Tetraedro(double aresta)
    {
        super();
        this.aresta = aresta;
    }
    
    @Override
    public double calculoVolume() 
    {
        double v;
        v = (Math.sqrt(2)*Math.pow(this.aresta,3))/12;
        this.setVolume(v);
        return v;
    }

    @Override
    public double calculoArea() 
    {
        double a;
        a = (Math.sqrt(3)*Math.pow(this.aresta,2))/4;
        this.setArea(a);
        return a;
    }
}